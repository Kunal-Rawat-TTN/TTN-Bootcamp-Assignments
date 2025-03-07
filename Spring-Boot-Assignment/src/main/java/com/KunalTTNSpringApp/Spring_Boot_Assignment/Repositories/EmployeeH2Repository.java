package com.KunalTTNSpringApp.Spring_Boot_Assignment.Repositories;


import com.KunalTTNSpringApp.Spring_Boot_Assignment.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeH2Repository extends JpaRepository<Employee, Integer> {
}
