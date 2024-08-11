package com.thecoderstv.springboot.circulardependency;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

@Component
public class Order {
    @Autowired
    private User user;

    public Order() {
        System.out.println("Order initialized[Eager Loading]");
    }

}
