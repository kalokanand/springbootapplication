package com.kalokanand.learning.spring.scope.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session")
public class UserSessionScope {

    public UserSessionScope(){
        System.out.println("UserSessionScope init");
    }

    @PostConstruct
    public void init(){
        System.out.println(String.format("Hashcode of UserSessionScope: %s", this.hashCode()));
    }
}
