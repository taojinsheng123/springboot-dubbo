package com.tcbci.gkit.business.service.product.imp;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.tcbci.gkit.business.domain.product.Product;
import com.tcbci.gkit.business.entity.product.ProductMapper;
import com.tcbci.gkit.business.service.product.ProductService;

@Service(version="1.0.0")
//@Service("gkitProductService")
public class ProductServiceImp implements ProductService {


	@Autowired
	private ProductMapper mapper;

	@Override
	public Product findById(Integer id) {
		return mapper.findById(id);
	}


}