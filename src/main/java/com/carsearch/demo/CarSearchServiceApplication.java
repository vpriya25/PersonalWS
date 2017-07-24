package com.carsearch.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CarSearchServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(CarSearchServiceApplication.class, args);
		
	}
	
}
