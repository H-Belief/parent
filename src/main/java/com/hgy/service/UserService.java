package com.hgy.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by huguoyu on 2017/9/15.
 */
@Service
public interface UserService {

    public List<Map<String,Object>> userList();
}
