package com.durgesh.fullstackapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class FullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackApplication.class, args);
	}
}
