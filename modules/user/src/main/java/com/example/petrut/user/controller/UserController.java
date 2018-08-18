package com.example.petrut.user.controller;

import com.example.petrut.user.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController("/user")
public class UserController {

    @Inject
    private PagingAndSortingRepository<User, String> userRepository;

    @GetMapping
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }
}
