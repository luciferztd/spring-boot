package com.example.demo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService service;


    @RequestMapping("/abc")
    public String paswd(@RequestBody User user) {
        String resp=service.authenticateUser(user.getUserName(),user.getPassword());
        return "hi";
    }
}
