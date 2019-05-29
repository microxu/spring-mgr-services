package com.eastict.cloud.service.impl;

import com.eastict.cloud.entities.OBSProduct;
import com.eastict.cloud.mapper.OBSProductMapper;
import com.eastict.cloud.service.OBSProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 一定不要少了
public class OBSProductServiceImpl implements OBSProductService {

	@Autowired
	OBSProductMapper productMapper;

	@Override
	public boolean add(OBSProduct product) {
		return productMapper.addProduct(product);
	}

	@Override
	public OBSProduct get(Long id) {
		return productMapper.findById(id);
	}

	@Override
	public List<OBSProduct> list() {
		return productMapper.findAll();
	}

}
