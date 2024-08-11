package com.thecoderstv.springboot.profiling;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class NoSQLConnection {
    @Value("${username}")
    public String username;

    @Value("${password}")
    public String password;

    @PostConstruct
    public void makeConnection() {
        System.out.println("NoSQL username " + username + " password = " + password);
    }
}
