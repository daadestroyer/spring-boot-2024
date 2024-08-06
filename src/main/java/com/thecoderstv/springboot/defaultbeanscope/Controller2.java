package com.thecoderstv.springboot.defaultbeanscope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
    @Autowired
    private User user;
    public Controller2(){
        System.out.println("Controller 2 instance initialization");
    }
    @GetMapping("/hello2")
    public String hello(){
        return "hello controller 1";
    }
    @PostConstruct
    public void init(){
        System.out.println("Controller 2 hashcode "+this.hashCode()+" User hashcode "+user.hashCode());
    }
}
