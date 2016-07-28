package com.kshrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class SpringRestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestFulApplication.class, args);
	}
}
