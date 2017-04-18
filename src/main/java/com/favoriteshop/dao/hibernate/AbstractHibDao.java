package com.favoriteshop.dao.hibernate;

import com.favoriteshop.dao.Dao;
import com.favoriteshop.model.AbstractModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public abstract class AbstractHibDao<T extends AbstractModel> implements Dao<T> {

    protected SessionFactory sessionFactory;
    private String entityName;
    private Class<T> clazz;

    public boolean create(T toCreate) {
        boolean res;
        try (Session session = sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                session.save(toCreate);
                session.getTransaction().commit();
                res = true;
            } catch (HibernateException e) {
                session.getTransaction().rollback();
                throw new RuntimeException("Cannot create new " + entityName, e);
            }
        }
        return res;
    }

    public boolean delete(long id) {
        boolean res;
        try (Session session = sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                T t = (T) getById(id);
                session.delete(t);
                session.getTransaction().commit();
                res = true;
            } catch (HibernateException e) {
                session.getTransaction().rollback();
                throw new RuntimeException("Cannot delete " + entityName, e);
            }
        }

        return res;
    }

    public abstract boolean update(T toUpdate, long id);

    public T getById(long id) {
        T res;
        try (Session session = sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                res = session.get(clazz, id);
                session.getTransaction().commit();
            } catch (HibernateException e) {
                session.getTransaction().rollback();
                throw new RuntimeException("Cannot get " + entityName, e);
            }
        }
        return res;
    }

    public List<T> getAll() {
        List<T> result;
        try (Session session = sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                result = session.createQuery("from " + entityName).list();
                session.getTransaction().commit();
            } catch (HibernateException e) {
                session.getTransaction().rollback();
                throw new RuntimeException("Cannot get all  " + entityName, e);
            }
        }
        return result;
    }
}
