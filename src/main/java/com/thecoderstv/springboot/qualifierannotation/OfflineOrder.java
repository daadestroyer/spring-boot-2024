package com.thecoderstv.springboot.qualifierannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OfflineOrder")
public class OfflineOrder implements Order{

    public void getDetails(){
        System.out.println("Offline order initialized");
    }
}
