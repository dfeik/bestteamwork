package com.yshen.controller;

import com.yshen.pojo.Buyer;
import com.yshen.service.BuyerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BuyerController {
    @Autowired
    BuyerServiceImpl buyerServiceImpl;
    @RequestMapping("/jsonbuyer")//和ajax请求中URL相对应
    public String json(Buyer buyer) {
        System.out.println(buyer);
        int b = buyerServiceImpl.addBuyer(buyer.getB_id(), buyer.getB_phone());
        return "contact";
        }

}
