package com.kalokanand.learning.componentscan;

import com.kalokanand.learning.springboot.components.Order;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ComponentScanBasePackages implements InitializingBean, DisposableBean {

    private Order order;

    public ComponentScanBasePackages(@Qualifier("onlineOrder") Order order){
        System.out.println("Creating a ComponentScanBasePackages bean");
        this.order = order;
        System.out.println("Injecting Dependency");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init setup");
    }

    @PostConstruct
    public String init(){
        System.out.println("Init setup using annotation");
        return "";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy setup");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("destroy setup annotation");
    }
}
