package com.kalokanand.learning.springboot.controller;

import com.kalokanand.learning.springboot.dto.EmployeeDto;
import com.kalokanand.learning.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employee")
    public ResponseEntity<List<EmployeeDto>> getEmployees(){
        return ResponseEntity.ok(employeeService.getEmployees());
    }
}
