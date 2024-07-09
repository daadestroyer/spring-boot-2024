package com.thecoderstv.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/welcome-admin")
    @ResponseBody
    public String welcomeAdmin() {
        return "welcome back admin";
    }
}
