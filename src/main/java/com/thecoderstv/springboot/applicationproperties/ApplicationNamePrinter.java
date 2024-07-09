package com.thecoderstv.springboot.applicationproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ApplicationNamePrinter {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${spring.name}")
    private String username;

    @Override
    public String toString() {
        return "ApplicationNamePrinter{" +
                "applicationName='" + applicationName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
