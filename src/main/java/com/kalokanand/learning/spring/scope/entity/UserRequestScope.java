package com.kalokanand.learning.spring.scope.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserRequestScope {

    public UserRequestScope(){
        System.out.println("UserRequestScope init");
    }

    @PostConstruct
    public void init(){
        System.out.println(String.format("Hashcode of UserRequestScope: %s", this.hashCode()));
    }
}
