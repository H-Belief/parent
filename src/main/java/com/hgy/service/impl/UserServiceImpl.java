package com.hgy.service.impl;

import com.hgy.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huguoyu on 2017/9/15.
 */
@Service
public class UserServiceImpl implements UserService{


    @Override
    public List<Map<String, Object>> userList() {
        List<Map<String,Object>> list = new ArrayList<>();
        for(int i = 0;i<20;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("id",i);
            map.put("name","周五"+i);
            list.add(map);
        }
        return list;
    }
}

