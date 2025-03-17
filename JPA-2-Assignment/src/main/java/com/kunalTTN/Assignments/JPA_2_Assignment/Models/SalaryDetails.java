package com.kunalTTN.Assignments.JPA_2_Assignment.Models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalaryDetails {
    Double basicSalary;
    Double bonusSalary;
    Double taxAmount;
    Double specialAllowanceSalary;
}
