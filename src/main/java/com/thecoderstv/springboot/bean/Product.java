package com.thecoderstv.springboot.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Product {
    @Autowired
    Category category;

//    public Product() {
//        System.out.println("Initializing Product");
//    }

//    @PostConstruct
//    public void initialize(){
//        System.out.println("bean is constructed and dependency is injected");
//    }
//    @PreDestroy
//    public void preDestroy(){
//        System.out.println("bean is about to destroy");
//    }
}
