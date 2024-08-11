//package com.thecoderstv.springboot.prototypebeanscope;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@Scope("prototype")
//public class TestController1 {
//    @Autowired
//    private Customer customer;
//
//    public TestController1() {
//        System.out.println("TestController 2 initializing");
//    }
//
//    @GetMapping("/api1")
//    public String hello() {
//        return "hello test controller 1";
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("TestController 1 initialized = " + customer.hashCode());
//    }
//}
