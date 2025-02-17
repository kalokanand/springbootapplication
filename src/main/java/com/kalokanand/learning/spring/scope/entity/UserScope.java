package com.kalokanand.learning.spring.scope.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class UserScope {

    public UserScope(){
        System.out.println("UserScope init");
    }

    @PostConstruct
    public void init(){
        System.out.println(String.format("Hashcode of UserScope: %s", this.hashCode()));
    }
}
