//package com.thecoderstv.springboot.circulardependency;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//@Component
//public class User {
//    @Autowired
//    @Lazy
//    private Order order;
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public User() {
//        System.out.println("User initialized[Lazy Loading]");
//    }
//}
