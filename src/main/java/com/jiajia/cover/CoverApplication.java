package com.jiajia.cover;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiajia.cover.dao")
public class CoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoverApplication.class, args);
    }

}
