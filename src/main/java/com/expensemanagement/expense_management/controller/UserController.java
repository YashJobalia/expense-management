package com.expensemanagement.expense_management.controller;

import com.expensemanagement.expense_management.model.User;
import com.expensemanagement.expense_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {

        System.out.println(user);
        userRepository.save(user);

        return user;
    }
}
