package com.auxo.springboot;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.context.annotation.Bean;

//@RunWith(DepartmentApplication.class)
@SpringBootApplication
@EnableJpaAuditing()
public class EmployeeApplication {
	
//	 @Bean
//	    public AuditorAware<String> auditorAware() {
//	        return new AuditorAwareImpl();
//	    }
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		
		
		System.err.println("first applicarion success");
		SpringApplication.run(DepartmentApplication.class, args);
	}

}
