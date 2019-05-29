package com.eastict.cloud;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@EnableHystrix //开启Hystrix的熔断机制
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@MapperScan("com.eastict.cloud.mapper")
@SpringBootApplication
public class SimpleService8001 {
    public static void main(String[] args) {
        SpringApplication.run(SimpleService8001.class, args);
    }
}
