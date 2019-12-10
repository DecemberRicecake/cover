package com.jiajia.cover.service;

import com.jiajia.cover.common.ServerResponse;
import com.jiajia.cover.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> productList();

    ServerResponse<String> addProduct(Product product);

    ServerResponse<String> delProduct(Integer productId);

    ServerResponse<String> setProduct(Product product);
}
