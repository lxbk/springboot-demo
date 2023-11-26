package com.aiyouv.demo.service.impl;

import com.aiyouv.demo.repository.entity.User;
import com.aiyouv.demo.repository.mapper.UserMapper;
import com.aiyouv.demo.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAllUsers() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        return userMapper.selectList(wrapper);
    }

    public User getUserById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUserByName(String name) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().like(User::getName, name);
        return userMapper.selectList(wrapper);
    }
}
