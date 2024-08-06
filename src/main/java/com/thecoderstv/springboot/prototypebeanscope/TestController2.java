//package com.thecoderstv.springboot.prototypebeanscope;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//public class TestController2 {
//    @Autowired
//    private Employee employee;
//    public TestController2(){
//        System.out.println("TestController 2 instance initialization");
//    }
//    @GetMapping("/api2")
//    public String hello(){
//        return "hello test controller 2";
//    }
//    @PostConstruct
//    public void init(){
//        System.out.println("TestController 2 hashcode "+this.hashCode()+" Employee hashcode "+employee.hashCode());
//    }
//}
