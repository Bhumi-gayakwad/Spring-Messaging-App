package com.springmessagingapp.spring.messaging.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC_2_name_as_query_parameter {
    @GetMapping("/hello/query")
    public String getHello(@RequestParam(value = "name") String name){
        return "Hello "+name;
    }
}
