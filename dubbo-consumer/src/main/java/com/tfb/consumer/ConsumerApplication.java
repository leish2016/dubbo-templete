package com.tfb.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        //设置默认时区
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
