package com.favoriteshop.dao.hibernate;

import com.favoriteshop.dao.UserDao;
import com.favoriteshop.model.User;

import java.util.List;

public class UserHibDao implements UserDao {
    public boolean create(User toCreate) {
        return false;
    }

    public boolean delete(long id) {
        return false;
    }

    public boolean update(User toUpdate) {
        return false;
    }

    public User getById(long id) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }
}
