package com.kunalTTN.Assignments.JPA_2_Assignment.Service;

import com.kunalTTN.Assignments.JPA_2_Assignment.Models.Employee;
import com.kunalTTN.Assignments.JPA_2_Assignment.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository)
    {
        this.employeeRepository=employeeRepository;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Object[]> getEmployeesWithSalaryAboveAverage() {
        return employeeRepository.findAllEmployeesWithSalaryGreaterThanAverage();
    }

    @Transactional
    public int updateSalaryBelowAverage(Double newSalary) {
        return employeeRepository.updateSalaryBelowAverage(newSalary);
    }

    @Transactional
    public int deleteEmployeesWithMinSalary() {
        return employeeRepository.deleteEmployeesWithMinSalary();
    }
}
