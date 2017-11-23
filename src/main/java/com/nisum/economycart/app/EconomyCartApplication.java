package com.nisum.economycart.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EconomyCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EconomyCartApplication.class, args);
	}
}
