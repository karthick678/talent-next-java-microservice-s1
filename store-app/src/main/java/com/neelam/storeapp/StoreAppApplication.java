package com.neelam.storeapp;

import com.neelam.storeapp.domain.Product;
import com.neelam.storeapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class StoreAppApplication implements CommandLineRunner {


	@Autowired
	@Qualifier(value = "productRepository")
	private ProductRepository productRepository;


	public static void main(String[] args) {
		SpringApplication.run(StoreAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product(null, "tv", "SONY", 100.50));
		productRepository.save(new Product(null, "mobile", "MI", 200.50));
		productRepository.save(new Product(null, "mobile", "OPPO", 800.50));
		productRepository.save(new Product(null, "tv", "DELL", 400.50));
	}
}
