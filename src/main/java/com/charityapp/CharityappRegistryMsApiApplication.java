package com.charityapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class CharityappRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharityappRegistryMsApiApplication.class, args);
		System.out.println("hello");
	}

}
