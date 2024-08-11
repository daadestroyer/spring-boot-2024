package com.thecoderstv.springboot.sessionbeanscope;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class InstaUser {
    public InstaUser() {
        System.out.println("InstaUser initializing");
    }

    @PostConstruct
    public void init() {
        System.out.println("InstaUser initialized --- InstaUser hashcode --" + this.hashCode());
    }
}
