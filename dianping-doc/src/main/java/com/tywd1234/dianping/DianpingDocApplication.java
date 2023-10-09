package com.tywd1234.dianping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tywd1234.dianping.mapper")
public class DianpingDocApplication {
    public static void main(String[] args) {
        SpringApplication.run(DianpingDocApplication.class, args);
    }
}
