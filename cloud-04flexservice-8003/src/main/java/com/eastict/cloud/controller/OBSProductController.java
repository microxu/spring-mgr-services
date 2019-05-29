package com.eastict.cloud.controller;

import com.eastict.cloud.entities.OBSProduct;
import com.eastict.cloud.service.OBSProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OBSProductController {

	@Autowired
	OBSProductClientService service;

	@RequestMapping(value = "/consumer/product/add")
	public boolean add(OBSProduct product) {
		return service.add(product);
	}

	@RequestMapping(value = "/consumer/product/get/{id}")
	public OBSProduct get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/consumer/product/list")
	public List<OBSProduct> list() {
		return service.list();
	}
}
