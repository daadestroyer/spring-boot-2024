package com.thecoderstv.springboot;

import com.thecoderstv.springboot.applicationproperties.ApplicationNamePrinter;
import com.thecoderstv.springboot.bean.User;
import com.thecoderstv.springboot.repositories.UserRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class SpringbootApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
//       ApplicationNamePrinter app = context.getBean("applicationNamePrinter", ApplicationNamePrinter.class);
//        System.out.println(app);

        // saving user to database
        /*
        UserRepositories userRepositories = context.getBean(UserRepositories.class);
        User user = new User();
        user.setUserid(102);
        user.setFirstname("pankaj");
        user.setLastname("nigam");
        user.setEmail("pankaj@gmail.com");
        user.setPincode("208001");

        User save = userRepositories.save(user);
        System.out.println(user);
        */

    }
}
