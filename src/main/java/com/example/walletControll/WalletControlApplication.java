package com.example.walletControll;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class WalletControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletControlApplication.class, args);
	}

}
