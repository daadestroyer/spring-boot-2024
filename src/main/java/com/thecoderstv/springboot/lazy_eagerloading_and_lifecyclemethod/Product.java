//package com.thecoderstv.springboot.lazy_eagerloading_and_lifecyclemethod;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Product {
//    @Autowired
//    Category category;
//
//    public Product() {
//        System.out.println("Initializing Product [Eager Initialization]");
//    }
//
//    @PostConstruct
//    public void initialize(){
//
//        System.out.println("Product bean is constructed and dependency is injected");
//    }
//    @PreDestroy
//    public void preDestroy(){
//
//        System.out.println("Product bean is about to destroy");
//    }
//}
