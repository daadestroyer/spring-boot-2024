package com.thecoderstv.springboot;

import com.thecoderstv.springboot.applicationproperties.ApplicationNamePrinter;
import com.thecoderstv.springboot.bean.User;
import com.thecoderstv.springboot.repositories.UserRepositories;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class SpringbootApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

//        Student student = context.getBean("student", Student.class);

//        student.getDetails();



//       ApplicationNamePrinter app = context.getBean("applicationNamePrinter", ApplicationNamePrinter.class);
//        System.out.println(a;pp)


//        UserRepositories userRepositories = context.getBean(UserRepositories.class);


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
        /*
        Optional<User> optionalUser = userRepositories.findById(105);
        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }
        else{
            System.out.println("no user found");
        }
         */

        // deleting all records
        //  userRepositories.deleteAll();

        // fetching all records
        /*
        List<User> userList = userRepositories.findAll();
        if(userList.size()==0){
            System.out.println("no records found");
        }
        else{
            userList.forEach(System.out::println);
        }
        */

        // findbyemail
        /*
        Optional<User> optionalUser = userRepositories.findByEmail("rekhaa@gmail.com");
        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }
        else{
            System.out.println("no records");
        }
         */

        // findByFirstNameAndLastName
        /*
        Optional<User> optionalUser = userRepositories.findByFirstnameAndLastname("shubham", "singh");
        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }
        else{
            System.out.println("no record");
        }
         */

        // findByFirstnameOrLastname
        /*
        Optional<User> optionalUser = userRepositories.findByFirstnameOrLastname("shubhamm", "singh");
        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }
        else{
            System.out.println("no record");
        }
        */

        // findByFirstnameStartingWith
        /*
        List<User> s = userRepositories.findByFirstnameStartingWith("S");
        s.forEach(System.out::println);
         */

        // findByFirstnameEndingWith
        /*
        List<User> m = userRepositories.findByLastnameEndingWith("m");
        m.forEach(System.out::println);
        */

        // findByFirstnameContaining
        /*
        List<User> b = userRepositories.findByFirstnameContaining("a");
        b.forEach(System.out::println);
         */

        // findUserByEmailJPQL
        /*
        Optional<User> userOptional = userRepositories.findByEmailJPQL("pankaj@gmail.com");
        if(userOptional.isPresent()){
            System.out.println(userOptional.get());
        }
        else{
            System.out.println("not found");
        }
         */

        // findUserByEmailNativeQuery
        /*
        Optional<User> optionalUser = userRepositories.findByEmailNativeQuery("pankaj@gmail.com");
        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }
        else{
            System.out.println("not found");
        }

         */

        // findByFirstnameAndLastnameJPQL
        /*
        Optional<User> optionalUser = userRepositories.findByFirstnameAndLastnameJPQL("shubham", "nigam");
        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }
        else{
            System.out.println("not found");
        }

         */

        // findByFirstnameAndLastnameNativeQuery
        /*
        Optional<User> optionalUser = userRepositories.findByFirstnameAndLastnameNativeQuery("rekha", "nigam");
        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }
        else{
            System.out.println("not found");
        }

         */

        // findByFirstnameOrLastnameJPQL
        /*
        Optional<User> userOptional = userRepositories.findByFirstnameOrLastnameJPQL("shubham1", "singh");
        if(userOptional.isPresent()){
            System.out.println(userOptional.get());
        }
        else{
            System.out.println("not found");
        }
*/
        // findByFirstnameOrLastnameNative
        /*
        Optional<User> userOptional = userRepositories.findByFirstnameOrLastnameNative("shubham1", "singh");
        if(userOptional.isPresent()){
            System.out.println(userOptional.get());
        }
        else{
            System.out.println("not found");
        }
         */

        // findByFirstnameOrLastnameNative
//        Optional<User> userOptional = userRepositories.findByFirstnameOrLastnameJPQL("raj", "singh");
//        if (userOptional.isPresent()) {
//            System.out.println(userOptional.get());
//        } else {
//
//            System.out.println("not found");
//        }
    }
}
