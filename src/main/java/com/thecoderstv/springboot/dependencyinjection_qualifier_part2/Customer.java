//package com.thecoderstv.springboot.dependencyinjection_qualifier_part2;
//
//import com.thecoderstv.springboot.dependencyinjection_qualifier_part2.Order;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Customer {
//
//    @Autowired
//    @Qualifier("OfflineOrder")
//    private Order order;
//
//    public Customer(Order order) {
//        this.order = order;
//    }
//
//    public Customer() {
//        System.out.println("Customer initialized");
//    }
//    @PostConstruct
//    public void initialize(){
//
//        order.getDetails();
//    }
//}
