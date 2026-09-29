package com.kenya.springy.fundamentals.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private static final Logger logger = LoggerFactory.getLogger(MyRestController.class);

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @Value("${my.name}")
    private String myName;

    @GetMapping("/")
    public String sayHello() {
        logger.info("GET / requested");
        return "Hello World!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }

    @GetMapping("/test")
    public String sayHotReload(){
        return "Hot Reloaded!";
    }

    @GetMapping("/myName")
    public String getMyName(){
        logger.info("GET /myName requested");
        return "My name is: " + myName;
    }

}