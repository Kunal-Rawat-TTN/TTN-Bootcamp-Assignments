package com.kunalTTN.SpringAssignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${marks}")
    private Integer marks;

    @Value("${name}")
    private String name;

    @Value("${role}")
    private String role;

    public String getRole() {
        return role;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
