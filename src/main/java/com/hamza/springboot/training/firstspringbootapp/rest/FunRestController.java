package com.hamza.springboot.training.firstspringbootapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    @Value("${developer.name}")
    private String developerName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("about")
    public String about(){
        return "Developer Name: "+developerName + "........." +"Team Name: "+ teamName;

    }
}
