package com.favoriteshop.dao;

import java.util.List;

public interface Dao<T> {

    boolean create(T toCreate);

    boolean delete(long id);

    boolean update(T toUpdate, long id);

    T getById(long id);

    List<T> getAll();

}
