package com.yong.springbootmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yong.springbootmall.dao.ProductDao;
import com.yong.springbootmall.model.Product;
import com.yong.springbootmall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId){
        return productDao.getProductById(productId);
    }
}
