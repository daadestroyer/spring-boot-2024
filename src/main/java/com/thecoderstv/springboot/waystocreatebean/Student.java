//package com.thecoderstv.springboot.waystocreatebean;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class Student {
//    @Value("101")
//    private int sid;
//    @Value("shubham nigam")
//    private String name;
//
//    @Autowired
//    private Address address;
//
//    public Student() {
//        System.out.println("IoC container found the bean Student");
//    }
//
//    public Student(int sid, String name) {
//        this.sid = sid;
//        this.name = name;
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("student loaded");
//    }
//
//    public void getDetails() {
//        System.out.println("sid = " + sid + " name = " + name + " address " + address);
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("student bean is about to destroy");
//    }
//}
