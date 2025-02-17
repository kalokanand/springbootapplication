package com.kalokanand.learning.spring.scope.controller;

import com.kalokanand.learning.spring.scope.entity.UserRequestScope;
import com.kalokanand.learning.spring.scope.entity.UserScope;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("scope/user")
@Scope(value = "request")
public class UserScopeController {

    @Autowired
    private UserScope user;
    @Autowired
    private UserRequestScope userRequestScope;

    public UserScopeController(){
        System.out.println("User controller init");
    }

    @PostConstruct
    public void init(){
        System.out.println(String.format("Hashcode of Employee Controller: %s " +
                        "\n Hashcode of UserScope: %s" +
                        "\n Hashcode of UserRequestScope: %s",
                System.identityHashCode(this),
                user.hashCode(),
                userRequestScope.hashCode()));
    }

    @GetMapping("hashcode")
    public String hashcode(){
        return String.format("Hashcode of User Controller: %s " +
                        "\n Hashcode of UserScope: %s" +
                        "\n Hashcode of UserRequestScope: %s",
                System.identityHashCode(this),
                user.hashCode(),
                userRequestScope.hashCode());
    }
}
