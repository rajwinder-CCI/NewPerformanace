package com.hrm.performance.Service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrm.performance.Exception.BadRequestException;
import com.hrm.performance.Repository.EmployeeRepository;
import com.hrm.performance.Service.EmployeeService;
import com.hrm.performance.dto.AddEmployeeDTO;
import com.hrm.performance.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(AddEmployeeDTO addEmployeeDTO) {
		Employee employee = new Employee();
		employee.setEmployeeId(addEmployeeDTO.getEmployeeId());
		employee.setEmployeeName(addEmployeeDTO.getEmployeeName());
		employee.setDesignation(addEmployeeDTO.getDesignation());
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(String employeeId) throws BadRequestException {
		Optional<Employee> employee=employeeRepository.findById(employeeId);
	 
		return employee.isPresent()?employee.get():null;
	}

	@Override
	public List<Employee> getEmployeeAll() {
		return employeeRepository.findAll();
	}

}
