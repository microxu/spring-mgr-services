package com.eastict.cloud.mapper;
import com.eastict.cloud.entities.OBSProduct;

import java.util.List;

//@Mapper //或者在启动类上标识 @MapperScan
public interface OBSProductMapper {

    OBSProduct findById(Long pid);

    List<OBSProduct> findAll();

    boolean addProduct(OBSProduct product);
}
