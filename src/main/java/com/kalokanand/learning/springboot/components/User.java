package com.kalokanand.learning.springboot.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Lazy
    @Autowired
    @Qualifier("offlineOrder")
    private Order order;

    public User() {
        System.out.println("Initializing User bean");
    }
}
