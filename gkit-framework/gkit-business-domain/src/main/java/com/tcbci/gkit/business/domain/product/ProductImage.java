package com.tcbci.gkit.business.domain.product;

import java.util.Date;

/**
 * T_gb_product_image 实体类 Sat Nov 12 17:48:28 CST 2016 yuhuaqiu
 */

public class ProductImage {
	private Integer id;// 自增
	private String productId;// 产品id
	private String url;// 图片路径
	private String name;// 图片名称
	private Date createDate;// 创建时间
	private Integer flag;// 标识 0.表示此版本为用户管理版本(用户编辑、审核的为此版本) 1.表示此版本为其它用户查看版本

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
