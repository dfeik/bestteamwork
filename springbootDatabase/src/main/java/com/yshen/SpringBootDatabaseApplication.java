package com.yshen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yshen")

public class SpringBootDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDatabaseApplication.class, args);
    }

}
