package com.auxo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication

public class DepartmentApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DepartmentApplication.class, args);
	}

}
