package com.xkw.article;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.xkw.framework.domain.article")//扫描实体类
@ComponentScan(basePackages={"com.xkw.framework"})//扫描common包下的类
@ComponentScan(basePackages={"com.xkw.article"})//扫描本项目下的所有类
public class ArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class,args);
    }
}

