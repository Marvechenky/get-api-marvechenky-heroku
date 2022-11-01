package com.example.webpage.controller;

import com.example.webpage.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

@GetMapping("/api/v1/object")
    public User user(){
    User user = new User("Marvechenky", true, 30, "I'm a Java developer");
    return user;
}

}
