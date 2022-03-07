package com.tfpl.ordermyfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OrderMyFoodApplication {

	public static void main(String[] args) {
		System.out.println("Test");
		SpringApplication.run(OrderMyFoodApplication.class, args);
	}

}
