package com.kalokanand.learning.springboot.components;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Product {

    @Autowired
    @Qualifier("offlineOrder")
    private Order order;

    public Product(){
        System.out.println("Initializing Product bean");
    }

    @PostConstruct
    public void init(){
        order.setOrder(this);
    }
}
