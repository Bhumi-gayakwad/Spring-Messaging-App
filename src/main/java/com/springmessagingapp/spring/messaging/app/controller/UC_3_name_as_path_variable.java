package com.springmessagingapp.spring.messaging.app.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC_3_name_as_path_variable {
    @GetMapping("/hello/param/{name}")
    public String getHello(@PathVariable String name){
        return "Hello "+name;
    }
}
