package com.kunalTTN.SpringAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Question_5 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Question_5.class);
        DevelopmentTeam developmentTeam = context.getBean(DevelopmentTeam.class);

        System.out.println(developmentTeam.getDeveloper1());
        System.out.println(developmentTeam.getDeveloper2());

        developmentTeam.getDeveloper1().doWork();
        developmentTeam.getDeveloper2().doWork();

    }
}
