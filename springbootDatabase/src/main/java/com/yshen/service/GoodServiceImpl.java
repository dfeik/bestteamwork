package com.yshen.service;

import com.yshen.map.GoodMapper;
import com.yshen.pojo.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService{
    @Autowired
    private GoodMapper goodMapper;

    @Override
    public int addGood(String g_name, String g_photo, String g_describe, float g_price, int g_number) {
        Good good = new Good();
        good.setG_name(g_name);
        good.setG_photo(g_photo);
        good.setG_describe(g_describe);
        good.setG_price(g_price);
        good.setG_number(g_number);
        return goodMapper.add(good);
    }
}
