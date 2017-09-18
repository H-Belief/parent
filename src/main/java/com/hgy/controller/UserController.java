package com.hgy.controller;

import com.hgy.model.User;
import com.hgy.service.UserService;
import com.hgy.util.enums.DictType;
import com.hgy.util.enums.IsDelete;
import com.hgy.util.enums.ResultType;
import com.hgy.util.json.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by huguoyu on 2017/9/15.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/userList")
    public String userList(Model model){
        return "userListPre";
    }

    @RequestMapping(value = "/queryUserList")
    @ResponseBody
    public JsonResult queryUserList(User user,Model model){
        JsonResult jsonResult = new JsonResult<>();
        List<User> list = new ArrayList<>();
        try {
            int totals = userService.userListCount(user);
            if(totals>0){
                list =  userService.userList(user);
            }
            jsonResult.setObj(list);
            jsonResult.setCode(ResultType.SUCCESS.getCode());
        }catch (Exception e){
            jsonResult.setObj(list);
            jsonResult.setCode(ResultType.FAILURE.getCode());
        }
        model.addAttribute("list",list);
        return jsonResult;

    }


    @RequestMapping(value = "/saveUser")
    @ResponseBody
    public JsonResult saveUser(User user){
        JsonResult jsonResult = new JsonResult();

        user.setUsername("123");
        user.setBirthday(new Date().getTime());
        user.setSex(DictType.SEX_MAN);
        user.setIsdelete(IsDelete.DEFAULT.getValue());
        user.setTelephone("阿斯达待");
        user.setAddress("北京市天安门广场隔壁");
        user.setIdnumber("阿达实打实");

        Integer primaryId = userService.saveUser(user);
        if(!StringUtils.isEmpty(primaryId)){
            jsonResult.setCode(ResultType.SUCCESS.getCode());
            jsonResult.setObj(ResultType.SUCCESS.getInfo());
        }else{
            jsonResult.setCode(ResultType.FAILURE.getCode());
            jsonResult.setObj(ResultType.FAILURE.getInfo());
        }
        return jsonResult;
    }
}
