package com.hrm.performance.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hrm.performance.entity.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee,String> {
//
//    @Query("select e from Employee e where e.employeeId = ?1")
//    Employee findByEmployeeId(String employeeId);

//    @Query("select e from Employee e")
//    List<Employee> getEmployees();

}
