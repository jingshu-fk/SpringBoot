package com.example.kuang.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/world")
    public String hello(){
        logger.info("demo test");
        return "Hello World";
    }
}
