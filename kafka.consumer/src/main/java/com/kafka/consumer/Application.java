package com.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kafka.config")
@ComponentScan("com.kafka.listener")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
