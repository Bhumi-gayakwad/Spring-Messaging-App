package com.springmessagingapp.spring.messaging.app.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC_1_rest_controller {
    @GetMapping("hello")
    public String getHello() {
        return "Hello";
    }
}
