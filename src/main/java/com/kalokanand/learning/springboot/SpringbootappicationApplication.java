package com.kalokanand.learning.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootappicationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
