//package com.thecoderstv.springboot.waystocreatebean;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Address {
//    @Value("kanpur")
//    private String city;
//
//    public Address(){
//        System.out.println("IoC container found the bean Address");
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("Address loaded");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("address bean is about to destroy");
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "city='" + city + '\'' +
//                '}';
//    }
//}
