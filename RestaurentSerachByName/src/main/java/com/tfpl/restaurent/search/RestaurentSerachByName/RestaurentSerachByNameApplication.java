package com.tfpl.restaurent.search.RestaurentSerachByName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurentSerachByNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurentSerachByNameApplication.class, args);
	}

}
