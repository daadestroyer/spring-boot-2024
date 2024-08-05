package com.thecoderstv.springboot.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    @Qualifier("OfflineOrder")
    @Autowired
    Order order;

    public Customer() {
        System.out.println("Customer initialized");
    }
    @PostConstruct
    public void initialize(){
        order.getDetails();
    }
}
