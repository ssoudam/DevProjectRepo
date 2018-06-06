package com.marketforbes.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientTest {

	public static void main(String[] args) {
	
		SpringApplication.run(EurekaClientTest.class, args);
		

	}

}
