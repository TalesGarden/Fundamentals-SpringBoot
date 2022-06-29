package com.dio;

import org.springframework.stereotype.Component;

@Component
public class Bean {

    @org.springframework.context.annotation.Bean
    public String getName(){
        return "Tales";
    }

    @org.springframework.context.annotation.Bean
    public Adress getAdresss()
    {
        return new Adress();
    }
}
