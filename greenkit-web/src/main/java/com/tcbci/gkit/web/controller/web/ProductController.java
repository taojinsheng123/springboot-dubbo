package com.tcbci.gkit.web.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.tcbci.gkit.business.domain.product.Product;
import com.tcbci.gkit.business.service.product.ProductService;
@Controller
@RequestMapping("enterprise")
public class ProductController {

	



	@Autowired  
    private ApplicationContext applicationContext;  
	
	@Reference(version="1.0.0")
	ProductService productService;
	
	@RequestMapping("product")
	@ResponseBody
	public ModelAndView getProduct() throws ClassNotFoundException{
		ModelAndView m=new ModelAndView();
		/* String url = "dubbo://192.168.56.1:20880/com.tcbci.gkit.business.service.product.ProductService?anyhost=true&application=provider&dubbo=2.5.3&interface=com.tcbci.gkit.business.service.product.ProductService&methods=findById&pid=7272&revision=1.0.0&side=provider×tamp=1517470327209&version=1.0.0";//更改不同的Dubbo服务暴露的ip地址&端口  
		  
	        ReferenceBean<ProductService> referenceBean = new ReferenceBean<ProductService>();  
	        referenceBean.setApplicationContext(applicationContext);  
	        referenceBean.setInterface(com.tcbci.gkit.web.controller.service.ProductService.class);  
	        referenceBean.setUrl(url);  
	  
	        try {  */
	            //referenceBean.afterPropertiesSet();  
	           // ProductService demoService = referenceBean.get();  
	            System.out.print(productService.findById(123123));  
	            System.err.println(productService.findById(123123).getName());
	           /* m.addObject("product", demoService.findById(123123));
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  */
		return m;
		
	}

}
