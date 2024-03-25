package com.neelam.storeAppConsumerEurekaFeign.fallback;

import com.neelam.storeAppConsumerEurekaFeign.model.Product;
import com.neelam.storeAppConsumerEurekaFeign.proxy.ProductServiceProxy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceFallback implements ProductServiceProxy {

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<Product>();
    }

    @Override
    public Optional<Product> getProductById(Integer id) {
        return Optional.of(new Product(1, "fallback", "circuit break", 123.9));
    }
}
