package com.todoapi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.todoapi.api")
//@EnableJpaRepositories(basePackages = "com.todoapi.api.repository")
//@EntityScan(basePackages = { "com.todoapi.api.model" }) // scan JPA entities

//@EnableScheduling

public class TodoapiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TodoapiApplication.class, args);
	}
	
}
