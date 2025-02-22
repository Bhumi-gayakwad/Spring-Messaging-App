package com.springmessagingapp.spring.messaging.app.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UC_5_put_request {

    @PutMapping("/hello/put/{firstName}/")
    public String putHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello "+firstName+" "+lastName;
    }
}
