//package com.thecoderstv.springboot.singletonbeanscope;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class Controller1 {
//    @Autowired
//    private User user;
//
//    public Controller1() {
//        System.out.println("Controller 1 initializing");
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("Controller 1 initialized = "+user.hashCode());
//    }
//}
