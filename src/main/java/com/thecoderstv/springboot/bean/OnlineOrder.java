package com.thecoderstv.springboot.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OnlineOrder")
public class OnlineOrder implements Order{
    public void getDetails(){
        System.out.println("Online order initialized");
    }
}
