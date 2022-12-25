package com.adp.userservice.controller;

import com.adp.userservice.model.UserEntity;
import com.adp.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserEntity createUser(@Valid @RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);
    }

    @GetMapping("/getUserByUserName/{userName}")
    public UserEntity getUserByUserName(@PathVariable("userName") String userName){
        return userService.getUserByUserName(userName);
    }
}
