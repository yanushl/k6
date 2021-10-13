package com.enterprise.controllers;

import com.enterprise.models.User;
import com.enterprise.repos.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public List<User> getAll() {
        return (List) userRepo.findAll();
    }

    @GetMapping("{id}")
    public User getOne(@PathVariable("id") User user) {
        return user;
    }

    @PutMapping
    public User put(@RequestBody User user) {
        return userRepo.save(user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") User user) {
        userRepo.delete(user);
    }
}
