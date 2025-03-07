package com.KunalTTNSpringApp.Spring_Boot_Assignment.Models;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name="designation")
    String designation;
}
