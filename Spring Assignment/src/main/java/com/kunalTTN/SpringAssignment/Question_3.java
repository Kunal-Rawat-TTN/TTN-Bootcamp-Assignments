package com.kunalTTN.SpringAssignment;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Using Spring instead of Spring Boot
@Configuration
@ComponentScan
public class Question_3 {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Question_3.class);
        SoftwareDeveloper softwareDeveloper= context.getBean(SoftwareDeveloper.class);
        softwareDeveloper.works();
    }
}
