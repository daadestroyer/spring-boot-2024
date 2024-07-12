package com.thecoderstv.springboot.controller;

import com.thecoderstv.springboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private User user;



    @RequestMapping("/welcome-admin")
    @ResponseBody
    public String welcomeAdmin() {

        return "welcome back admin";
    }

    @RequestMapping("/home")
    public String index() {
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

}
