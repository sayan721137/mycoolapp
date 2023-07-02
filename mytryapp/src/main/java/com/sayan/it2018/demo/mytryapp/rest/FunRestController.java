package com.sayan.it2018.demo.mytryapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String sayHi(){
        return "Hello Sayan Welcome To Spring Boot 3";
    }

}
