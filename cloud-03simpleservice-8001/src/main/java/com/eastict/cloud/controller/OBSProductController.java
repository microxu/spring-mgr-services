package com.eastict.cloud.controller;

import com.eastict.cloud.entities.OBSProduct;
import com.eastict.cloud.service.OBSProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OBSProductController {

	@Autowired
	private OBSProductService productService;

	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public boolean add(@RequestBody OBSProduct product) {
		return productService.add(product);
	}

	// fallbackMethod 指定当get方法出现异常时,将要调用的处理方法
	// 处理方法的返回值和参数类型要一致
	@HystrixCommand(fallbackMethod = "getFallback")
	@RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
	public OBSProduct get(@PathVariable("id") Long id) {
		OBSProduct product = productService.get(id);
		// 如果product为空,则模拟一个异常,
		if (product == null) {
			throw new RuntimeException("ID=" + id + "无效");
		}
		return product;
	}

	public OBSProduct getFallback(@PathVariable("id") Long id) {
		return new OBSProduct(id, "ID=" + id + "无效----@HystrixCommand");
	}

	@RequestMapping(value = "/product/list", method = RequestMethod.GET)
	public List<OBSProduct> list() {
		return productService.list();
	}

}
