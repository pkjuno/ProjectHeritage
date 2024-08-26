package com.project.Heritage.projectHeritage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ProjectHeritageApplication{

	public static void main(String[] args) {
		System.out.println("스프링부트 시작");
		SpringApplication.run(ProjectHeritageApplication.class, args);
	}

}
