//package com.thecoderstv.springboot.waystocreatebean;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//
//
//public class Employee {
//    @Value("102")
//    private int eid;
//    @Value("raj nigam")
//    private String ename;
//
//    public Employee(int eid, String ename) {
//        this.eid = eid;
//        this.ename = ename;
//    }
//    @PostConstruct
//    public void init(){
//        System.out.println("employee loaded");
//    }
//    public void getDetails(){
//        System.out.println("eid = "+eid+" ename = "+ename);
//    }
//}
