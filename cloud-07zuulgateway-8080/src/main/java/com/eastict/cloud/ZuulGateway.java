package com.eastict.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //开启zuul的功能
@SpringBootApplication
public class ZuulGateway {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway.class, args);
    }
}
