package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/docker")
public class HelloDockerController {

    @GetMapping(value = "hello")
    public String HelloDocker(){
         return "Hello, SpringBoot With Docker";
    }
}
