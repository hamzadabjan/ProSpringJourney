package com.hamza.springboot.training.firstspringbootapp.dependencyinjection;


import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Construction:"+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Throw 1000 balls daily";
    }
}
