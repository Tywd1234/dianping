package com.tywd1234.dianping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.tywd1234.dianping.mapper")
@SpringBootApplication
public class DianpingUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianpingUserApplication.class, args);
    }

}
