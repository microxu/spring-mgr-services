package com.eastict.cloud.service;

import com.eastict.cloud.entities.OBSProduct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // 一定要加上它,将它纳入到容器中
public class OBSProductClientServiceFallBack implements OBSProductClientService {

	@Override
	public boolean add(OBSProduct product) {
		return false;
	}

	@Override
	public OBSProduct get(Long id) {
		return new OBSProduct(id, "id=" + id + "无数据");
	}

	@Override
	public List<OBSProduct> list() {
		return null;
	}
}
