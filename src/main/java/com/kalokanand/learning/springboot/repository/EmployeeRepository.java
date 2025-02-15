package com.kalokanand.learning.springboot.repository;

import com.kalokanand.learning.springboot.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepository {

    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee[]{
                        new Employee(1l, "Alok", 10000.0),
                        new Employee(2l, "Anand", 20000.0),
                        new Employee(3l, "Adrika", 8000.0)
                });
    }
}
