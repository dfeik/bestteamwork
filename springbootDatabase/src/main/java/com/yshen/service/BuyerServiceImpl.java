package com.yshen.service;

import com.yshen.pojo.Buyer;
import com.yshen.map.BuyerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService{
    @Autowired
    private BuyerMapper buyerMapper;

    @Override
    public int addBuyer(String b_id, String b_phone) {
        Buyer buyer = new Buyer();
        buyer.setB_id(b_id);
        buyer.setB_phone(b_phone);
        return buyerMapper.add(buyer);
    }
}
