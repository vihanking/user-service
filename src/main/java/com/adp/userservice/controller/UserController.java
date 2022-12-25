package com.adp.userservice.controller;

import com.adp.userservice.model.UserEntity;
import com.adp.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserEntity createUser(@Valid @RequestBody UserEntity userEntity){
        System.out.println("DUmbu gadu");
        return userService.createUser(userEntity);
    }

    @GetMapping("/getUserByUserName/{userName}")
    public UserEntity getUserByUserName(@PathVariable("userName") String userName){
        return userService.getUserByUserName(userName);
    }

    @GetMapping("/getUsersByFirstName/{firstName}")
    public List<UserEntity> getUsersByFirstName(@PathVariable("firstName") String firstName){
        return userService.getUsersByFirstName(firstName);
    }

}
