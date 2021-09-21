package com.yshen.map;

import com.yshen.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Insert({"insert into User(pet_name, phone, password) values('${User.pet_name}','&{User.phone}'}','&{User.password}')"})
    int add(@Param("User") User user);
}
