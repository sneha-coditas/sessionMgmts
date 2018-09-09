package com.sessions.sample.sessionSample.controller;


import org.springframework.web.bind.annotation.*;


@RestController
public class TestController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){

        return "Hello World";

    }
}