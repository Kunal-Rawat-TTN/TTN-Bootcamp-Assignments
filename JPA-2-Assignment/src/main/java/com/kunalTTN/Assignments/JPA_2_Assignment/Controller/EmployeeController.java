package com.kunalTTN.Assignments.JPA_2_Assignment.Controller;

import com.kunalTTN.Assignments.JPA_2_Assignment.Models.Employee;
import com.kunalTTN.Assignments.JPA_2_Assignment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/salary/aboveAverage")
    public List<Object[]> getEmployeesWithSalaryAboveAverage() {
        return employeeService.getEmployeesWithSalaryAboveAverage();
    }

    @PutMapping("/salary/{newSalary}")
    public int updateSalaryBelowAverage(@PathVariable Double newSalary) {
        return employeeService.updateSalaryBelowAverage(newSalary);
    }

    @DeleteMapping("/minSalary")
    public int deleteEmployeesWithMinSalary() {
        return employeeService.deleteEmployeesWithMinSalary();
    }
}
