package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface IsignUpService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}




