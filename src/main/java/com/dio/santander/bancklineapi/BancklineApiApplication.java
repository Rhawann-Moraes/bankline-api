package com.dio.santander.bancklineapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="br.com.dio.santander.bancklineapi.controller")
public class BancklineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancklineApiApplication.class, args);
	}

}
