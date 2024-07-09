package com.thecoderstv.springboot.controller;

import com.thecoderstv.springboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/welcome-user")
    @ResponseBody
    public String welcomeUser() {
        return "welcome back user";
    }
}
