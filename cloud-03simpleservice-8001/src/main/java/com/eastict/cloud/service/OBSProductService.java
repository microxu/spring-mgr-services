package com.eastict.cloud.service;


import com.eastict.cloud.entities.OBSProduct;

import java.util.List;

public interface OBSProductService {

    boolean add(OBSProduct product);

    OBSProduct get(Long id);

    List<OBSProduct> list();

}
