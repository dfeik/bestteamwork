package com.yshen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/mydb")

public class databaseController {
    @Autowired
        private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getUser")
        public List<Map<String,Object>> getUser() {
            String sql = "select * from Buyer";
            List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
            return list;
    }
}
