package com.TTN.Kunal.JPA_Assignment_1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull
    @NotBlank(message = "Please provide a employee name")
    String name;

    @NotNull
    @Min(value = 18,message = "Must be above 18")
    Integer age;

    @NotNull
    @NotBlank(message = "Please provide a location")
    String location;
}
