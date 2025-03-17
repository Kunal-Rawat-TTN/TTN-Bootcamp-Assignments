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

    @Modifying
    @Query("Update Employee e set e.salary=:updatedSalary where e.salary<(select AVG(e2.salary) from Employee e2)")
    int updateSalaryBelowAverage(@Param("updatedSalary") Double updatedSalary);

    @Modifying
    @Query("Delete from Employee e where e.salary = (select MIN(e2.salary) from Employee e2)")
    int deleteEmployeesWithMinSalary();
}
