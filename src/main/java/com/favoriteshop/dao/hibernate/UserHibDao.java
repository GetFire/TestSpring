package com.favoriteshop.dao.hibernate;

import com.favoriteshop.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class UserHibDao extends AbstractHibDao<User> {
    public boolean update(User toUpdate, long id) {
        boolean res;
        try (Session session = sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                User user = getById(id);
                user.setContact(toUpdate.getContact());
                user.setFirstName(toUpdate.getFirstName());
                user.setLastName(toUpdate.getLastName());
                user.setLogin(toUpdate.getLogin());
                user.setPassword(toUpdate.getPassword());
                user.setConfirmPassword(toUpdate.getConfirmPassword());
                user.setRole(toUpdate.getRole());
                session.update(user);
                session.getTransaction().commit();
                res = true;
            } catch (HibernateException e) {
                session.getTransaction().rollback();
                throw new RuntimeException("Cannot update Product", e);
            }
        }
        return res;
    }
}
