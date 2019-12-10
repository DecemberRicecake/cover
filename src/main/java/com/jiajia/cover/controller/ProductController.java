package com.jiajia.cover.controller;

import com.jiajia.cover.common.ServerResponse;
import com.jiajia.cover.entity.Product;
import com.jiajia.cover.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/product/")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping(value = "productlist", method = RequestMethod.GET)
    public ModelAndView productList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("moban");
        mv.addObject("productdata", iProductService.productList());
        mv.addObject("templatename", "productlist");
        return mv;
    }

    @RequestMapping(value = "addproduct", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> addProduct(@RequestBody Product product){
        return iProductService.addProduct(product);
    }

    @RequestMapping(value = "delproduct", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> delProduct(@RequestBody Integer productId){
        return iProductService.delProduct(productId);
    }

    @RequestMapping(value = "setproduct", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> setProduct(@RequestBody Product product){
        return iProductService.setProduct(product);
    }

}
