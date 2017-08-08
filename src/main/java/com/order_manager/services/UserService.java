package com.order_manager.services;

import com.order_manager.mappers.UserMapper;
import com.order_manager.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByUuid(String uuid) {
        return userMapper.getUserByUuid(uuid);
    }

}