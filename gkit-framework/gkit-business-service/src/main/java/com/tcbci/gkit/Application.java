 package com.tcbci.gkit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.tcbci.gkit.business.domain.product.Product;
import com.tcbci.gkit.business.service.product.ProductService;

@SpringBootApplication
@MapperScan("com.tcbci.gkit.busniess")
public class Application {

	public static void main(String[] args) {                                                                            
		
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ProductService bean = run.getBean(ProductService.class);
		Product findById = bean.findById(123123);
		System.out.println(findById);
	}
}
                                                                       