package com.yshen.service;

import com.yshen.pojo.User;
import com.yshen.map.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(String pet_name, String phone, String password) {
        User user = new User();
        user.setPet_name(pet_name);
        user.setPhone(phone);
        user.setPassword(password);
        return userMapper.add(user);
    }
}
