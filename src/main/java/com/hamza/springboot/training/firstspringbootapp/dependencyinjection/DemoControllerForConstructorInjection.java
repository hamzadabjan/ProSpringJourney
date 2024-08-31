package com.hamza.springboot.training.firstspringbootapp.dependencyinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class DemoControllerForConstructorInjection {



    //define a private field for dependency
    private final Coach myCoach;


    // define a constructor for dependency injection
    @Autowired
    public DemoControllerForConstructorInjection(@Qualifier("swimmCoach") Coach theCoach){
        myCoach=theCoach;
        System.out.println("in constructor:"+getClass().getSimpleName());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
