package com.smfst.xcw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.smfst.xcw.mapper")
public class XcwApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcwApplication.class, args);
    }

}
