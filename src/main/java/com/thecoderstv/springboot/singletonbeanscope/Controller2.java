//package com.thecoderstv.springboot.singletonbeanscope;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class Controller2 {
//    @Autowired
//    private User user;
//
//    public Controller2() {
//        System.out.println("Controller 2 initializing");
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("Controller 2 initialized = "+user.hashCode());
//    }
//}
