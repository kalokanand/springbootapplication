package com.kalokanand.learning.springboot.service;

import com.kalokanand.learning.springboot.dto.EmployeeDto;
import com.kalokanand.learning.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDto> getEmployees() {
        return employeeRepository.getEmployees().stream()
                .map(e -> new EmployeeDto().employeeMapper(e))
                .collect(Collectors.toList());
    }
}
