package com.yshen.map;

import com.yshen.pojo.Good;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodMapper {
    @Insert({"insert into Good(g_name, g_describe, g_photo, g_price, g_number) values('${good.g_name}','${good.g_describe}','${good.g_photo}','${good.g_price}','${good.g_number}')"})
    int add(@Param("good") Good good);
}
