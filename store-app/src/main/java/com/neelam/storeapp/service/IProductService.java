package com.neelam.storeapp.service;

import com.neelam.storeapp.domain.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public List<Product> getAllProducts();
    public Optional<Product> getProductById(Integer id);
    public void deleteProductById(Integer id);

    public List<Product> findByName(String name);
    public List<Product> findByBrand(String brand);
    public List<Product> findByPrice(double price);
}
