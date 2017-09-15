package com.hgy.controller;

import com.hgy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by huguoyu on 2017/9/15.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/queryUserList")
    public String queryUserList(Model model){
        List<Map<String,Object>> list =  userService.userList();
        model.addAttribute("list",list);
        return "userListPre";
    }
}
