package com.jiajia.cover.dao;

import com.jiajia.cover.entity.Product;
import com.jiajia.cover.entity.User;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> queryAllProduct();
}