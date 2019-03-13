package com.xkw.soft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.xkw.framework.domain.soft")//扫描实体类
@ComponentScan(basePackages={"com.xkw.framework"})//扫描common包下的类
@ComponentScan(basePackages={"com.xkw.soft"})//扫描本项目下的所有类
public class SoftApplication {
    public static void main(String[] args) {
        SpringApplication.run(SoftApplication.class,args);
    }
}
