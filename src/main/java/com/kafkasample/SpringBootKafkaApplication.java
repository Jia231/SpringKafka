package com.kafkasample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
    	System.out.println("Let's inspect the beans provided by Spring Boot:");	
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootKafkaApplication.class, args);	
	}
}