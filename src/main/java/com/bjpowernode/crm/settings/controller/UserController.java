package com.bjpowernode.crm.settings.controller;

import com.bjpowernode.crm.settings.bean.User;
import com.bjpowernode.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName UserController
 * @Description
 * @Author PowerNode
 * @Date 2020/11/16 20:21
 * @Version 1.0
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/querUsers")
    @ResponseBody
    public List<User> querUsers(){
        return userService.querUsers();
    }

}
