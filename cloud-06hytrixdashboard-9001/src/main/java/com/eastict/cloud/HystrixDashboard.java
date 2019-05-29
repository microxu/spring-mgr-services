package com.eastict.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard //开启服务监控
@SpringBootApplication
public class HystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard.class, args);
    }

}
