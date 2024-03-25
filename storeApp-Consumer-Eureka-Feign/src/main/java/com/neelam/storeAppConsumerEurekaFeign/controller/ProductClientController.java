package com.neelam.storeAppConsumerEurekaFeign.controller;

import com.neelam.storeAppConsumerEurekaFeign.model.Product;
import com.neelam.storeAppConsumerEurekaFeign.proxy.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Scope("request")
public class ProductClientController {

    @Autowired
    private ProductServiceProxy productServiceProxy;

    @GetMapping(value = "/get-products/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Optional<Product> getProductById(@PathVariable("id") Integer id) {
        return this.productServiceProxy.getProductById(id);
    }

    @GetMapping(value = "get-products", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Product> getAllProducts() {
        return this.productServiceProxy.getAllProducts();
    }

}
