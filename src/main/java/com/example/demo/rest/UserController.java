package com.example.demo.rest;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public UserDTO getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
