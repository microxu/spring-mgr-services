package com.eastict.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//会扫描指定包下面使用@FeignClient标识的接口
@EnableFeignClients(basePackages = "com.eastict.cloud.service")
@EnableEurekaClient // 标识 是一个Eureka客户端
@SpringBootApplication
public class FlexService {

	public static void main(String[] args) {
		SpringApplication.run(FlexService.class, args);
	}

}
