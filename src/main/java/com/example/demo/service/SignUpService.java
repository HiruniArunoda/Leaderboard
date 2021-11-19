package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignUpService implements IsignUpService {

    @Autowired
    private UserRepository UserRepository;

    @Override
    public User saveUser(User user) {
        return UserRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return UserRepository.findAll();
    }

}