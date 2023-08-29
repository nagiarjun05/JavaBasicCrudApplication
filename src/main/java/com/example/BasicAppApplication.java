package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories(  basePackages = { "com.example.repositories.*" })
//@ComponentScan({ "com.example.models", "com.example.repositories"})

public class BasicAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(BasicAppApplication.class, args);
	}
}