package com.neelam.storeapp.repository;

import com.neelam.storeapp.domain.Product;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "productRepository")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByName(String name);
    List<Product> findByBrand(String brand);
    List<Product> findByPrice(Double price);
}
