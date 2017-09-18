package com.hgy.service.impl;

import com.hgy.mapper.UserMapper;
import com.hgy.model.User;
import com.hgy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huguoyu on 2017/9/15.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList(User user) {

        return userMapper.queryUserList(user);
    }

    @Override
    public int userListCount(User user) {
        return userMapper.queryUserListCount(user);
    }

    @Override
    public Integer saveUser(User user) {
        return userMapper.insert(user);
    }
}

