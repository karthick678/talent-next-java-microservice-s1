package com.neelam.storeappconsumereurekaribbon.service;

import com.neelam.storeappconsumereurekaribbon.model.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Scope(value = "singleton")
public class ProductService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackMethodForGetProductById")
    public Product getProductById(Integer id) {
        Product products = restTemplate.getForObject("http://product-service/product/" + id, Product.class);
        return products;
    }

    public Product fallbackMethodForGetProductById(Integer id) {
        System.out.println("callback ===============");
        return new Product(1, "Monitor fallback", "cmpy", 100.5);
    }
}
