package com.KunalTTNSpringApp.Spring_Boot_Assignment;

import com.KunalTTNSpringApp.Spring_Boot_Assignment.Config.AppConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootAssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAssignmentApplication.class, args);
		AppConfig appConfig=context.getBean(AppConfig.class);
		System.out.println("Company Name :- "+appConfig.getCompany());
		System.out.println("Company Id :- "+appConfig.getCompanyId());
		System.out.println("Company Location :- "+appConfig.getLocation());

	}

}
