package com.wu.service;

import com.wu.mapper.UserMapper;
import com.wu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public int insertUser(User user) {

        int i = userMapper.insertUser(user);
        return i;
    }
}
