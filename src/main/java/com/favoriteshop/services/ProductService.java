package com.favoriteshop.services;

import com.favoriteshop.dao.ProductDao;
import com.favoriteshop.model.Product;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductService {

    private ProductDao productDao;

    public List<Product> getAllGoods() {
        return productDao.getAll();
    }
}
