package com.aiyouv.demo.service;

import com.aiyouv.demo.repository.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(String id);

    List<User> getUserByName(String name);
}
