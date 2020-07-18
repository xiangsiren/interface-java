package com.nettys.api.jc;

import org.springframework.context.annotation.*;
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        System.out.println("111111111");
        return new HelloWorld();
    }
}