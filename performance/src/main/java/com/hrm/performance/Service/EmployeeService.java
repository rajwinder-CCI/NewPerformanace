package com.hrm.performance.Service;

import java.util.List;

import com.hrm.performance.Exception.BadRequestException;
import com.hrm.performance.dto.AddEmployeeDTO;
import com.hrm.performance.entity.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(AddEmployeeDTO addEmployeeDTO);

	public Employee getEmployeeById(String employeeId) throws BadRequestException;

	public List<Employee> getEmployeeAll();

}
