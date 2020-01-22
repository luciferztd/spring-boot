package com.example.demo.login.controller.api;

import com.example.demo.login.controller.request.UserSigninRequest;
import com.example.demo.login.dto.model.UserDto;
import com.example.demo.login.service.UserService;
import com.example.demo.login.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    UserService service;

//    @CrossOrigin
//    @GetMapping("/abc")
//    public String paswod(@RequestBody User user) {
//        String resp=service.authenticateUser(user.getUserName(),user.getPassword());
//        return resp;
//    }

    @CrossOrigin
    @PostMapping("/auth")
    public String paswd(@RequestBody @Valid UserSigninRequest userSigninRequest) {
//        String resp=service.authenticateUser(user.getUserName(),user.getPassword());
//        return resp;
        UserDto userDto=new UserDto();
        userDto.setUserName(userSigninRequest.getUserName());
        userDto.setPassword(userSigninRequest.getPassword());
        return service.authenticateUser(userDto);
    }
}
