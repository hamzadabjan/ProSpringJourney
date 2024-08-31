package com.hamza.springboot.training.firstspringbootapp.dependencyinjection;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Construction:"+ getClass().getSimpleName());
    }

    @PostConstruct
    public void doSomeStuffAfterConstruction(){
        System.out.println("some stuff after Construction");
    }

    @PreDestroy
    public void doSomeStuffBeforeDestroy(){
        System.out.println("some stuff Before Destroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Throw 1000 balls daily";
    }
}
