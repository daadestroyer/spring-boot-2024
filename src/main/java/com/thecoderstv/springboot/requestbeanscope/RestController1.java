package com.thecoderstv.springboot.requestbeanscope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class RestController1 {
    @Autowired
    private Teacher teacher;

    public RestController1(){
        System.out.println("RestController 1 instance initialization");
    }

    @GetMapping("/rest1")
    public String hello(){
        return "hello rest controller 1";
    }
    @PostConstruct
    public void init(){
        System.out.println("RestController 1 hashcode "+this.hashCode()+" Teacher hashcode "+teacher.hashCode());
    }
}
