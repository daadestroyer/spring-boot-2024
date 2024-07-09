package com.thecoderstv.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		ApplicationNamePrinter app = context.getBean("applicationNamePrinter", ApplicationNamePrinter.class);
		System.out.println(app);
	}

}
