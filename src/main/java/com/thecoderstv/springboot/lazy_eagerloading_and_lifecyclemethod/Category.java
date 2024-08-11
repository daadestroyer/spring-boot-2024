//package com.thecoderstv.springboot.lazy_eagerloading_and_lifecyclemethod;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//@Component
//@Lazy
//public class Category {
//    public Category(){
//
//        System.out.println("Initializing Category [Lazy Initialization]");
//    }
//    @PostConstruct
//    public void initialize(){
//
//        System.out.println("Category bean is constructed and dependency is injected");
//    }
//    @PreDestroy
//    public void preDestroy(){
//
//        System.out.println("Category bean is about to destroy");
//    }
//}
