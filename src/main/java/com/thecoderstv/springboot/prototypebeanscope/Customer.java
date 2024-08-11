//package com.thecoderstv.springboot.prototypebeanscope;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Component
//@Scope("prototype")
//public class Customer {
//    public Customer() {
//        System.out.println("Customer Initializing");
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("Customer Initialized ---- Customer Hashcode = "+this.hashCode());
//    }
//}
