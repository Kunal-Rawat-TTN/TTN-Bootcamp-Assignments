package com.TTN.Kunal.JPA_Assignment_1.Controller;

import com.TTN.Kunal.JPA_Assignment_1.Model.Employee;
import com.TTN.Kunal.JPA_Assignment_1.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    // Create a new employee
    @PostMapping()
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteById(id);
        return ResponseEntity.ok("Employee deleted successfully.");
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getTotalCount() {
        return ResponseEntity.ok(employeeService.getTotalCountOfEmployee());
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable String name) {
        return ResponseEntity.ok(employeeService.getEmployeeByName(name));
    }

    @GetMapping("/findByAgeRange")
    public ResponseEntity<List<Employee>> getEmployeesBetween28And32() {
        return ResponseEntity.ok(employeeService.getEmployeesBetween28And32());
    }

    @GetMapping("/findByNameStartsWith/{character}")
    public ResponseEntity<List<Employee>> findEmployeeByNameAndStartWith(@PathVariable char character) {
        return ResponseEntity.ok(employeeService.findEmployeeByNameStartsWith(character));
    }

    @GetMapping("/paging/{pageNo}")
    public ResponseEntity<List<Employee>> findEmployeeByAgeWithPaginationAndSorting(@PathVariable Integer pageNo) {
        return ResponseEntity.ok(employeeService.findEmployeeByAgeWithPaginationAndSorting(pageNo>0?pageNo:1));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.updateEmployeeByID(id,employee));
    }
}