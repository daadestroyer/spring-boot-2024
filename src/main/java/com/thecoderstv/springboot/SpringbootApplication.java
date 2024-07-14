package com.thecoderstv.springboot;

import com.thecoderstv.springboot.applicationproperties.ApplicationNamePrinter;
import com.thecoderstv.springboot.bean.User;
import com.thecoderstv.springboot.repositories.UserRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class SpringbootApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
//       ApplicationNamePrinter app = context.getBean("applicationNamePrinter", ApplicationNamePrinter.class);
//        System.out.println(app);


        UserRepositories userRepositories = context.getBean(UserRepositories.class);


        // saving user to database
        /*
        User user = new User();
        user.setUserid(104);
        user.setFirstname("rajni");
        user.setLastname("nigam");
        user.setEmail("rajni@gmail.com");
        user.setPincode("208005");

        User save = userRepositories.save(user);
        System.out.println(user);
        */

        // deleting data from database
        // using id
        /*
        userRepositories.deleteById(104);
        System.out.println("data deleted");
        */

        // using object
        /*
        User user = new User();
        user.setUserid(103);
        user.setFirstname("raj");
        user.setLastname("nigam");
        user.setEmail("raj@gmail.com");
        user.setPincode("208000");
        userRepositories.delete(user);
        System.out.println("user deleted...");
        */

        // update records
        /*
        Optional<User> optionalUser = userRepositories.findById(102);
        if(optionalUser.isPresent()){
            User dbUser = optionalUser.get();
            dbUser.setFirstname("pankaj new");
            dbUser.setLastname("nigam new");
            dbUser.setPincode("208000");
            dbUser.setEmail("pankajnew@gmail.com");
            User updatedUser = userRepositories.save(dbUser);
            System.out.println(updatedUser);
        }
        else{
            System.out.println("no user found");
        }
        */

        // fetching single record
        Optional<User> optionalUser = userRepositories.findById(105);
        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }
        else{
            System.out.println("no user found");
        }


    }
}
