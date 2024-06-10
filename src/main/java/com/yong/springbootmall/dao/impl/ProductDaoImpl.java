package com.yong.springbootmall.dao.impl;

import com.yong.springbootmall.dao.ProductDao;
import com.yong.springbootmall.model.Product;
import com.yong.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer productId){

        String sql = "select product_id,product_name, category, image_url, price, stock, " +
                "description, created_date, last_modified_date from product " +
                "Where product_id = :productId";
        Map<String, Object> map = new HashMap<>();
        map.put("productId",productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if (productList.size() > 0 ){
            return  productList.get(0);
        }else {
            return null;
        }
    }

}
