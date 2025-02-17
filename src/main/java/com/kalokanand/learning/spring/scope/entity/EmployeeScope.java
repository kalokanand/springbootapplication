package com.kalokanand.learning.spring.scope.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class EmployeeScope {

    public EmployeeScope(){
        System.out.println("EmployeeScope init");
    }

    @PostConstruct
    public void init(){
        System.out.println(String.format("Hashcode of EmployeeScope: %s", this.hashCode()));
    }
}
