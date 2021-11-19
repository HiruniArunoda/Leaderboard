package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.IsignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class SignUpController {

    @Autowired
    private IsignUpService ISignupService;

    @PostMapping("/user")
    public ResponseEntity<?> add(@RequestBody User user){
        return new ResponseEntity<>(ISignupService.saveUser(user), HttpStatus.CREATED);
    }

    // DTO - Data Transfer Object
    // DTO Mapper Interface, DTO Class, Mapper Implementation

    @GetMapping("/getAll")
    public List<User> list(){
        return ISignupService.getAllUsers();
    }



}
