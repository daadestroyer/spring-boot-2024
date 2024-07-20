package com.thecoderstv.springboot.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class RestAPIController {

    // get api use to get the existing resource
    // @GetMapping = @RequestMapping(value="/get-api", method=RequestMethod.GET)
    @GetMapping("/get-api")
    public ResponseEntity<String> getAPI() {
        // HttpResponseCode = 200 = OK
        return new ResponseEntity<>("getting resource", HttpStatus.OK);
    }

    @GetMapping("/get-api-predirect")
    public ResponseEntity<String> getAPIPermanentRedirect() {

        return new ResponseEntity<>("permanent redirec", HttpStatus.PERMANENT_REDIRECT);
    }

    @PostMapping("/find-user/{id}")
    public ResponseEntity<String> findUserById(@PathVariable int id) {
        return new ResponseEntity<>(id +" not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/admin-dashboard")
    public ResponseEntity<String> getAdminDashboard(){
        return new ResponseEntity<>("you are unauthorized",HttpStatus.UNAUTHORIZED);
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        return new ResponseEntity<>("Something went wrong...",HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // to post the new resource
    // @PostMapping = @RequestMapping(value="/post-api", method=RequestMethod.POST)
    @PostMapping("/post-api")
    public ResponseEntity<String> postAPI() {
        return new ResponseEntity<>("resource created",HttpStatus.CREATED);
    }

    // to update the existing resource
    // @PutMapping = @RequestMapping(value="/put-api", method=RequestMethod.PUT)
    @PutMapping("/put-api")
    public String putAPI() {
        return "this is put api";
    }

    // to delete the existing resource
    // @DeleteMapping = @RequestMapping(value="/delete-api", method=RequestMethod.DELETE)
    @DeleteMapping("/delete-api")
    public String deleteAPI() {
        return "this is delete-api";
    }
}
