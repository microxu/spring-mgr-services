package com.eastict.cloud.service;

import com.eastict.cloud.entities.OBSProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

// fallback 作用，指定熔断处理类，如果被调用的方法处理异常，就会交给熔断处理类中的方法进行处理
@FeignClient(value = "cloud-03simpleservice-8001", fallback = OBSProductClientServiceFallBack.class) //指定调用的微服务名称
@Service
public interface OBSProductClientService {

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    boolean add(@RequestBody OBSProduct product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    OBSProduct get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<OBSProduct> list();

}
