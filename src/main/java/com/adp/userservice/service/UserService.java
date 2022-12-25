package com.adp.userservice.service;

import com.adp.userservice.model.UserEntity;
import com.adp.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public UserEntity getUserByUserName(String userName) {
        return userRepository.findById(userName).get();
    }
}
