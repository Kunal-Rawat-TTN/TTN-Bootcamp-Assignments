package com.TTN.Kunal.JPA_Assignment_1.Repository;

import com.TTN.Kunal.JPA_Assignment_1.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findEmployeeByName(String name);

    List<Employee> findEmployeeByNameStartsWith(Character character);

    List<Employee> findEmployeeByAgeBetween(Integer lowerBoundAge, Integer upperBound);


}
