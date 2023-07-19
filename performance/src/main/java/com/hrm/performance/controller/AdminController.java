package com.hrm.performance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hrm.performance.Exception.ForbiddenException;
import com.hrm.performance.Exception.ResponseHandler;
import com.hrm.performance.Service.AdminService;
import com.hrm.performance.Service.EmployeeService;
import com.hrm.performance.dto.AddAdminDTO;
import com.hrm.performance.dto.AddEmployeeDTO;
import com.hrm.performance.dto.AddTaskDTO;
import com.hrm.performance.entity.Admin;
import com.hrm.performance.entity.Employee;
import com.hrm.performance.entity.Task;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private AdminService adminService;
	
	

	@PostMapping("/employee")
	public ResponseEntity<Object> addEmployee(@RequestBody AddEmployeeDTO addEmployeeDTO) {
		try {
			Employee employee = employeeService.addEmployee(addEmployeeDTO);
			return ResponseHandler.generateSuccessResponse(employee, HttpStatus.CREATED);
		} catch (DataIntegrityViolationException e) {
			return ResponseHandler.generateErrorResponse(e.getMostSpecificCause().getMessage(), HttpStatus.CONFLICT);
		} catch (Exception e) {
			return ResponseHandler.generateErrorResponse("Something went wrong!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/employee")
	public ResponseEntity<Object> getEmployeeAll() {
		try {

			List<Employee> employees = employeeService.getEmployeeAll();
			return ResponseHandler.generateSuccessResponse(employees, HttpStatus.OK);
		} catch (Exception e) {
			return ResponseHandler.generateErrorResponse("Something went wrong!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/Admin")
	public ResponseEntity<Object> addAdmin(@RequestBody AddAdminDTO addAdminDTO) {
		try {
			Admin admin = adminService.addAdmin(addAdminDTO);
			return ResponseHandler.generateSuccessResponse(admin, HttpStatus.CREATED);
		} catch (DataIntegrityViolationException e) {
			return ResponseHandler.generateErrorResponse(e.getMostSpecificCause().getMessage(), HttpStatus.CONFLICT);
		} catch (Exception e) {
			return ResponseHandler.generateErrorResponse("Something went wrong!", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping("/task")
	public ResponseEntity<Object> addTask(@RequestBody AddTaskDTO addTaskDTO) {
		try {
			Task task = adminService.addTask(addTaskDTO);
			return ResponseHandler.generateSuccessResponse(task, HttpStatus.CREATED);
		} catch (DataIntegrityViolationException e) {
			return ResponseHandler.generateErrorResponse(e.getMostSpecificCause().getMessage(), HttpStatus.CONFLICT);
		} catch (Exception e) {
			return ResponseHandler.generateErrorResponse("Something went wrong!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/task")
	public void updateTask(@RequestBody AddTaskDTO addTaskDTO) {
		try {
			adminService.updateTask(addTaskDTO);
			// ResponseHandler.generateSuccessResponse(task, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.print(e);
		}

	}
	
	@PostMapping("/tasks")
	public void newtask() throws JsonProcessingException {
		
		adminService.newtask();
	}
	
	

}
