package com.favoriteshop.dao.hibernate;

import com.favoriteshop.model.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class ProductHibDao extends AbstractHibDao<Product> {

    public boolean update(Product toUpdate, long id) {
        boolean res;
        try (Session session = sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                Product product = getById(id);
                product.setName(toUpdate.getName());
                product.setDescription(toUpdate.getDescription());
                product.setManufacturer(toUpdate.getManufacturer());
                product.setPrice(toUpdate.getPrice());
                product.setUrl(toUpdate.getUrl());
                session.update(product);
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
