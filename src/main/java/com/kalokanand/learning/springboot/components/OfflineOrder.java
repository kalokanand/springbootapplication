package com.kalokanand.learning.springboot.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OfflineOrder implements Order {

    @Autowired
    @Lazy
    private Product product;

    public OfflineOrder(){
        System.out.println("Initializing OfflineOrder bean");
    }

    @Override
    public void setOrder(Product product) {
        this.product = product;
    }
}
