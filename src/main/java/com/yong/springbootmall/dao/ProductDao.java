package com.yong.springbootmall.dao;

import com.yong.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer ProductId);
}
