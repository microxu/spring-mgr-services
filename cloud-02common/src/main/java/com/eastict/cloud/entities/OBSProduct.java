package com.eastict.cloud.entities;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OBSProduct implements Serializable {	
	private static final long serialVersionUID = 1L;
    private Long  pid;   //主键
    private String  productName;   //产品名称
}

