package com.thecoderstv.springboot;

import com.thecoderstv.springboot.applicationproperties.ApplicationNamePrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		ApplicationNamePrinter app = context.getBean("applicationNamePrinter", ApplicationNamePrinter.class);
		System.out.println(app);
	}

}
