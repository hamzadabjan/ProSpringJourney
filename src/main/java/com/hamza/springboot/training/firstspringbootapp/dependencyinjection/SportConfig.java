package com.hamza.springboot.training.firstspringbootapp.dependencyinjection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {


    @Bean
    public Coach swimmCoach(){
        return new SwimmCoach();
    }
}
