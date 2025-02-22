package com.springmessagingapp.spring.messaging.app.controller;
import com.springmessagingapp.spring.messaging.app.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UC_4_first_last_name {
    @PostMapping("/hello")
    public String postHello(@RequestBody User user){
        return "Hello "+ user.getFirstName() + " " + user.getLastName();
    }
}
