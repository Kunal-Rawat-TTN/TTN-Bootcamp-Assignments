package com.kunalTTN.SpringAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@Configuration
@PropertySource("app.properties")
public class Question_4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Question_4.class);
        Employee employee= context.getBean(Employee.class);
        System.out.println(employee);
        System.out.println("Name :- "+employee.getName());
        System.out.println("Role :- "+employee.getRole());
        System.out.println("Marks :- "+employee.getMarks());
    }
}
