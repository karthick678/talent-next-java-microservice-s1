package com.neelam.storeAppConsumerEurekaFeign.proxy;

import com.neelam.storeAppConsumerEurekaFeign.fallback.ProductServiceFallback;
import com.neelam.storeAppConsumerEurekaFeign.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(value = "product-service",
        fallback = ProductServiceFallback.class)
public interface ProductServiceProxy {
    @GetMapping(value = "/products", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Product> getAllProducts();

    @GetMapping(value = "/product/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Optional<Product> getProductById(@PathVariable("id") Integer id);
}
