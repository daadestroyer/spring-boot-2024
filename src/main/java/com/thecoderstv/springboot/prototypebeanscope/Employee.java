//package com.thecoderstv.springboot.prototypebeanscope;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Component
//@Scope("prototype")
//public class Employee {
//    public Employee() {
//        System.out.println("Employee initializing");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("Employee initialized --- Employee hashcode --" + this.hashCode());
//    }
//}
