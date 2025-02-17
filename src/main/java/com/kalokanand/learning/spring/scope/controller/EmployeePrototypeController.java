package com.kalokanand.learning.spring.scope.controller;

import com.kalokanand.learning.spring.scope.entity.EmployeeScope;
import com.kalokanand.learning.spring.scope.entity.UserRequestScope;
import com.kalokanand.learning.spring.scope.entity.UserScope;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("scope/employee")
public class EmployeePrototypeController {

    @Autowired
    private  EmployeeScope employee;

    @Autowired
    private UserScope user;

    @Autowired
    private UserRequestScope userRequestScope;

    public EmployeePrototypeController(){
        System.out.println("Employee controller init");
    }

    @PostConstruct
    public void init(){
        System.out.println(String.format("Hashcode of Employee Controller: %s " +
                "\n Hashcode of EmployeeScope: %s " +
                        "\n Hashcode of UserScope: %s" +
                        "\n Hashcode of UserRequestScope: %s",
                System.identityHashCode(this),
                employee.hashCode(),
                user.hashCode(),
                userRequestScope.hashCode()));
    }

    @GetMapping("hashcode")
    public String hashcode(){
        return String.format("Hashcode of Employee Controller: %s " +
                "\n Hashcode of EmployeeScope: %s " +
                        "\n Hashcode of UserScope: %s" +
                        "\n Hashcode of UserRequestScope: %s",
                System.identityHashCode(this),
                employee.hashCode(),
                user.hashCode(),
                userRequestScope.hashCode());
    }

}
