package com.capgemini.projectfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capgemini")
public class ProjectfrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectfrontendApplication.class, args);
	}
}
