package com.hgy.service;

import com.hgy.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by huguoyu on 2017/9/15.
 */
@Service
public interface UserService {

    public List<User> userList(User user);

    public int userListCount(User user);

    public Integer saveUser(User user);

}
