//package com.thecoderstv.springboot.sessionbeanscope;
//
//import com.thecoderstv.springboot.requestbeanscope.Teacher;
//import jakarta.annotation.PostConstruct;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Scope("session")
//public class InstaController {
//    @Autowired
//    private InstaUser instaUser;
//
//    public InstaController() {
//        System.out.println("InstaController  instance initialization");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("InstaController hashcode " + this.hashCode() + " InstaUser hashcode " + instaUser.hashCode());
//    }
//
//    @GetMapping("/login")
//    public String hello() {
//        System.out.println("logged in");
//        return "logged in";
//    }
//
//    @GetMapping("/fetch")
//    public ResponseEntity<?> fetchUser(){
//        return new ResponseEntity<>("fetch api invoked", HttpStatus.OK);
//    }
//    @GetMapping("/logout")
//    public String logout(HttpServletRequest request) {
//        System.out.println("end the session");
//        HttpSession session = request.getSession();
//        session.invalidate();
//        return "user logged out";
//    }
//
//}
