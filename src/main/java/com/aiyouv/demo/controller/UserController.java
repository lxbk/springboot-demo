package com.aiyouv.demo.controller;

import com.aiyouv.demo.repository.entity.User;
import com.aiyouv.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers (){
       return userService.getAllUsers();
    }

    @GetMapping("/id/{id}")
    public User getUserById (@PathVariable("id") String id){
        return userService.getUserById(id);
    }

    @GetMapping("/name/{name}")
    public List<User> getUserByName (@PathVariable("name") String name){
        return userService.getUserByName(name);
    }

}
