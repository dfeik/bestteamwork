package com.yshen.controller;

import com.yshen.pojo.User;
import com.yshen.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;
    @RequestMapping("")
    public String json(User user) {
        System.out.println(user);
        int u = userServiceImpl.addUser(user.getPet_name(), user.getPhone(), user.getPassword());
        return "buyer";
    }
}
