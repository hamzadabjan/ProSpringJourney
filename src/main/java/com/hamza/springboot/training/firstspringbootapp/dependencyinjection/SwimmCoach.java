package com.hamza.springboot.training.firstspringbootapp.dependencyinjection;

public class SwimmCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swimm for 100m daily";
    }
}
