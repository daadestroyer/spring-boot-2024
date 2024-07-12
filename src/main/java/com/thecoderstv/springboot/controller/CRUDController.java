package com.thecoderstv.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/crud")
public class CRUDController {

    private static ArrayList<String> list = new ArrayList<>();

    static {
        list.add("id = 101, username=shubham nigam, password=shubh123 ");
        list.add("id = 102, username=rakesh nigam, password=rakesh123 ");
        list.add("id = 103, username=pankaj nigam, password=pankaj123 ");
    }

    @RequestMapping(value = "/save-data", method = RequestMethod.POST)
    @ResponseBody
    public String saveData(@RequestParam int userId, @RequestParam String username, @RequestParam String password) {
        list.add("id = " + userId + ", username=" + username + ", password=" + password);
        return "records saved";
    }

    @RequestMapping(value = "/get-all-records", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<String> getAllRecords() {
        return list;
    }

    @RequestMapping(value = "/get-by-id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getSingleRecords(@PathVariable String id) {
        for (String s : list) {
            if (s.contains(id)) {
                return s;
            }
        }
        return "no record found";
    }

    @RequestMapping(value = "delete-by-id/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteById(@PathVariable String id) {
        for (String s : list) {
            if (s.contains(id)) {
                list.remove(s);
                return s;
            }
        }
        return "no record found";
    }

}
