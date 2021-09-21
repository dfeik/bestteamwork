package com.yshen.map;

import com.yshen.pojo.Buyer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerMapper {
    @Insert({"insert into Buyer(b_id, b_phone) values('${buyer.b_id}','${buyer.b_phone}')"})
    int add(@Param("buyer") Buyer buyer);
}
