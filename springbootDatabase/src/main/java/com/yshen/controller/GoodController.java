package com.yshen.controller;

import com.yshen.pojo.Good;
import com.yshen.service.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GoodController {
    @Autowired
    GoodServiceImpl goodServiceImpl;
    @RequestMapping("")//和ajax请求中URL相对应
    public String json(Good good) {
        System.out.println(good);
        int g = goodServiceImpl.addGood(good.getG_name(), good.getG_photo(), good.getG_describe(), good.getG_price(), good.getG_number());
        return "contact";
    }
}
