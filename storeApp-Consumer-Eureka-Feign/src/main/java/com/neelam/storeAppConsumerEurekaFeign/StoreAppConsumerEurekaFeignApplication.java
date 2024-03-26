package com.neelam.storeAppConsumerEurekaFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class StoreAppConsumerEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppConsumerEurekaFeignApplication.class, args);
	}

}
