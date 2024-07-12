package com.thecoderstv.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1")
public class HttpRequestCodeController {

    @RequestMapping(value = "/http-mapping",method = RequestMethod.GET)
    @ResponseBody
    public String getRequest(){
        return "this is get request";
    }

    @RequestMapping(value = "/http-mapping",method = RequestMethod.POST)
    @ResponseBody
    public String postRequest(){
        return "this is post request";
    }

    @RequestMapping(value = "/http-mapping",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteRequest(){
        return "this is delete request";
    }

    @RequestMapping(value = "/http-mapping",method = RequestMethod.PUT)
    @ResponseBody
    public String putRequest(){
        return "this is put request";
    }
}
