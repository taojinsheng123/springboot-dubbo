package com.tcbci;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.context.ConfigurableApplicationContext;

import com.tcbci.gkit.business.domain.product.Product;
import com.tcbci.gkit.business.service.product.ProductService;
import com.tcbci.gkit.web.controller.web.ProductController;  

@SpringBootApplication 
public class ClientApplication {
	public static void main(String[] args) throws ClassNotFoundException {
		 ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);  
	}
}
                  