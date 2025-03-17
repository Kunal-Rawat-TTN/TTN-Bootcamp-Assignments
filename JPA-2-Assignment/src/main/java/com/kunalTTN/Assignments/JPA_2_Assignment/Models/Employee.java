package com.kunalTTN.Assignments.JPA_2_Assignment.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EmployeeTable")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empId")
    Long id;

    @Column(name = "empFirstName")
    String firstName;

    @Column(name = "empLastName")
    String lastName;

    @Column(name = "empSalary")
    Double salary;

    @Column(name = "empAge")
    Integer age;

    @Embedded
    SalaryDetails salaryDetails;
}
