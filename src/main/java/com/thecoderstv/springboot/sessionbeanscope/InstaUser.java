package com.thecoderstv.springboot.sessionbeanscope;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class InstaUser {
    public InstaUser() {
        System.out.println("InstaUser initializing");
    }

    @PostConstruct
    public void init() {
        System.out.println("InstaUser initialized --- InstaUser hashcode --" + this.hashCode());
    }
}
