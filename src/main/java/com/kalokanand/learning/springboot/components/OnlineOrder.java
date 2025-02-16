package com.kalokanand.learning.springboot.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OnlineOrder implements Order {

    @Autowired
    private User user;

    private Product product;

    public OnlineOrder(){
        System.out.println("Initializing Online bean");
    }

    public void setOrder(Product product) {
        this.product = product;
    }
}
