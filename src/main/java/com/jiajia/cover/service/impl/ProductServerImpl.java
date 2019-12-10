package com.jiajia.cover.service.impl;

import com.jiajia.cover.common.ServerResponse;
import com.jiajia.cover.dao.ProductMapper;
import com.jiajia.cover.entity.Product;
import com.jiajia.cover.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServerImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> productList() {
        return productMapper.queryAllProduct();
    }

    @Override
    public ServerResponse<String> addProduct(Product product) {
        int rowCount = productMapper.insertSelective(product);
        if (rowCount > 0) return ServerResponse.createBySuccessMessage("添加成功");
        return ServerResponse.createByErrorMessage("添加失败");
    }

    @Override
    public ServerResponse<String> delProduct(Integer productId) {
        int rowCount = productMapper.deleteByPrimaryKey(productId);
        if (rowCount > 0) return ServerResponse.createBySuccessMessage("删除成功");
        return ServerResponse.createByErrorMessage("删除失败");
    }

    @Override
    public ServerResponse<String> setProduct(Product product) {
        int rowCount = productMapper.updateByPrimaryKeySelective(product);
        if (rowCount > 0) return ServerResponse.createBySuccessMessage("更新成功");
        return ServerResponse.createByErrorMessage("更新失败");
    }
}
