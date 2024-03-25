package com.neelam.storeappconsumereurekaribbon.controller;

import com.neelam.storeappconsumereurekaribbon.model.Product;
import com.neelam.storeappconsumereurekaribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class ProductClientController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/get-products/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Product getProductById(@PathVariable("id") Integer id) {
        return productService.getProductById(id);
    }
}
