package com.kunalTTN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Module 1");
        ApplicationContext context = SpringApplication.run(HelloService.class, args);
        HelloService helloServiceBean = context.getBean(HelloService.class);
        System.out.println(helloServiceBean.getMessage());
    }
}

@Component
class HelloService {
    public String getMessage() {
        return "Hello from Spring Boot!";
    }
}
