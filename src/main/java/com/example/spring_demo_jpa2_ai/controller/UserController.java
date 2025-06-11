package com.example.spring_demo_jpa2_ai.controller;

import com.example.spring_demo_jpa2_ai.entity.User;
import com.example.spring_demo_jpa2_ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userRepository) {
        this.userService = userRepository;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllActiveUsers() {
        List<User> users = userService.getAllActiveUsers();
        return ResponseEntity.ok(users);
    }
}