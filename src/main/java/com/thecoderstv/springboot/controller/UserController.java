package com.thecoderstv.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/welcome-user")
    @ResponseBody
    public String welcomeUser() {
        return "welcome back user";
    }

    // localhost:8080/user/about-user/25
    // @PathVariable Annotation
    @RequestMapping("/about-user/{age}/{name}/{city}/{pincode}")
    @ResponseBody
    public String aboutUser(@PathVariable String age, @PathVariable String name,
                            @PathVariable String city, @PathVariable int pincode) {
        return "Hello " + name + " your age is = " + age + " city = " + city + " pincode = " + pincode;
    }

    // @RequestParam
    // localhost:8080/user/about-user?username=shubham&password=shubh123
    @RequestMapping("/about-user")
    @ResponseBody
    public String aboutUserQueryParam(@RequestParam String username , @RequestParam String password){
        return "Your username = "+username+" password = "+password;
    }
}
