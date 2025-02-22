package com.nie.emrserve.demos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.nie.mapper")
@ComponentScan(basePackages = {"com.nie.emrserve.demos", "com.nie.controller","com.nie.Form","com.nie.pojo","com.nie.service","com.nie.VO","com.nie.mapper"})
public class emrApplication {

    public static void main(String[] args) {
        SpringApplication.run(emrApplication.class, args);

    }

}

