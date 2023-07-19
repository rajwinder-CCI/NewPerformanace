package com.hrm.performance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hrm.performance.Exception.BadRequestException;
import com.hrm.performance.Exception.ResponseHandler;
import com.hrm.performance.Service.EmployeeService;
import com.hrm.performance.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getEmployeeById(@PathVariable("id") String employeeId ){
        try {
            Employee employee=employeeService.getEmployeeById(employeeId);
            return ResponseHandler.generateSuccessResponse(employee,HttpStatus.OK);
        } catch (BadRequestException e) {
            return ResponseHandler.generateErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return ResponseHandler.generateErrorResponse("Something went wrong!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
