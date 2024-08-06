package com.thecoderstv.springboot.prototypebeanscope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestController1 {
    @Autowired
    private Employee employee;

    public TestController1(){
        System.out.println("TestController 1 instance initialization");
    }

    @GetMapping("/api1")
    public String hello(){
        return "hello test controller 1";
    }
    @PostConstruct
    public void init(){
        System.out.println("TestController 1 hashcode "+this.hashCode()+" Employee hashcode "+employee.hashCode());
    }
}
