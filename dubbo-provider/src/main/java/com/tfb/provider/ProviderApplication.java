package com.tfb.provider;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
@MapperScan(basePackages = "com.tfb.provider.mapper")
public class ProviderApplication {

    public static void main(String[] args) {
        //设置默认时区
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        SpringApplication.run(ProviderApplication.class, args);
    }

}
