package com.example.spring_demo_jpa2_ai.service;

import com.example.spring_demo_jpa2_ai.entity.User;
import com.example.spring_demo_jpa2_ai.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllActiveUsers() {
        return userRepository.findByActiveTrue();
    }
}