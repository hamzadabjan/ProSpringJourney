package com.hamza.springboot.training.firstspringbootapp.dependencyinjection;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("In Construction:"+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice on penalties for 30 min daily";
    }
}
