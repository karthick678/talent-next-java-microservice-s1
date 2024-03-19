package com.neelam.storeappconsumereurekaribbon.controller;

import com.neelam.storeappconsumereurekaribbon.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Scope("request")
public class ProductClientController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/get-products/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Product getProductById(@PathVariable("id") Integer id) {
        Product products = restTemplate.getForObject("http://product-service/product/" + id, Product.class);
        return products;
    }
}
