package com.kunalTTN.Assignments.JPA_2_Assignment;

import com.kunalTTN.Assignments.JPA_2_Assignment.Models.Employee;
import com.kunalTTN.Assignments.JPA_2_Assignment.Models.SalaryDetails;
import com.kunalTTN.Assignments.JPA_2_Assignment.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jpa2AssignmentApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void createEmployee()
	{
		SalaryDetails salaryDetails=new SalaryDetails(15000D, 5000D, 2000D,3000D);
		Employee employee=new Employee();
		employee.setAge(23);
		employee.setSalary(37834D);
		employee.setFirstName("Netik");
		employee.setLastName("Kholi");
		employee.setSalaryDetails(salaryDetails);
		employeeRepository.save(employee);
	}

}
