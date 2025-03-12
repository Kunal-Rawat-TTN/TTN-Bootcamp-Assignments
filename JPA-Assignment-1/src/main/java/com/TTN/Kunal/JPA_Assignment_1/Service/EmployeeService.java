package com.TTN.Kunal.JPA_Assignment_1.Service;

import com.TTN.Kunal.JPA_Assignment_1.GlobalExceptions.EmployeeNotFoundException;
import com.TTN.Kunal.JPA_Assignment_1.Model.Employee;
import com.TTN.Kunal.JPA_Assignment_1.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee " + id + " doesn't exist"));
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    public Long getTotalCountOfEmployee() {
        return employeeRepository.count();
    }

    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findEmployeeByName(name);
    }

    public List<Employee> getEmployeesBetween28And32() {
        return employeeRepository.findEmployeeByAgeBetween(28, 32);
    }

    public List<Employee> findEmployeeByNameStartsWith(Character character) {
        return employeeRepository.findEmployeeByNameStartsWith(character);
    }

    public List<Employee> findEmployeeByAgeWithPaginationAndSorting(Integer pageNo) {
        return employeeRepository.findAll(PageRequest.of(pageNo - 1, 3,
                Sort.by(Sort.Order.desc("age")))).getContent();
    }
}
