//package com.thecoderstv.springboot.requestbeanscope;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Component
//@Scope("request")
//public class Teacher {
//    public Teacher() {
//        System.out.println("Teacher initializing");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("Teacher initialized --- Teacher hashcode --" + this.hashCode());
//    }
//}
