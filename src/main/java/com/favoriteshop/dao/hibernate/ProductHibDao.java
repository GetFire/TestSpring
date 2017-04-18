package com.favoriteshop.dao.hibernate;

import com.favoriteshop.dao.ProductDao;
import com.favoriteshop.model.Product;

import java.util.List;

public class ProductHibDao implements ProductDao {
    public boolean create(Product toCreate) {
        return false;
    }

    public boolean delete(long id) {
        return false;
    }

    public boolean update(Product toUpdate) {
        return false;
    }

    public Product getById(long id) {
        return null;
    }

    public List<Product> getAll() {
        return null;
    }
}
