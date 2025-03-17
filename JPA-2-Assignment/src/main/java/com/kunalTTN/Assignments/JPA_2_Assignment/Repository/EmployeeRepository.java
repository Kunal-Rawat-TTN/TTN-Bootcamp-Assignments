package com.kunalTTN.Assignments.JPA_2_Assignment.Repository;

import com.kunalTTN.Assignments.JPA_2_Assignment.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
//    Batch Insertion in Sequence
    //Advantages of TABLE, UUID
    @Query("Select e.firstName, e.lastName from Employee e where e.salary>(select AVG(e2.salary) from Employee e2) Order by e.age ASC, e.salary DESC")
    List<Object[]> findAllEmployeesWithSalaryGreaterThanAverage();

    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double findAverageSalary();

    @Modifying
    @Query("UPDATE Employee e SET e.salary = :newSalary WHERE e.salary < :avgSalary")
    int updateSalaryBelowAverage(@Param("newSalary") Double newSalary, @Param("avgSalary") Double avgSalary);

    @Query("SELECT MIN(e.salary) FROM Employee e")
    Double findMinSalary();

    @Modifying
    @Query("Delete from Employee where salary = :minSalary")
    int deleteEmployeesWithMinSalary(@Param("minSalary") Double minSalary);

    @Query(value = "Select id, firstName, age from Employee where lastName like '%Singh')",nativeQuery = true)
    List<Object[]> findAllEmployeeWithLastNameSingh();
}
