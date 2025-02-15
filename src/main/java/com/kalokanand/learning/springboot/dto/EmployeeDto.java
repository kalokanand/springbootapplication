package com.kalokanand.learning.springboot.dto;

import com.kalokanand.learning.springboot.entity.Employee;
import lombok.Data;

@Data
public class EmployeeDto {

    private Long id;
    private String name;
    private Double salary;

    public EmployeeDto employeeMapper(Employee employee){
        this.setId(employee.getId());
        this.setName(employee.getName());
        this.setSalary(employee.getSalary());
        return this;
    }
}
