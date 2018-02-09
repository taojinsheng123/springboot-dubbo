package com.tcbci.gkit.business.domain.product;

import java.util.Date;

/**
 * T_gb_product_drawing 实体类 Sat Nov 12 14:59:13 CST 2016 yuhuaqiu
 */

public class ProductDrawing {
	private Integer id;// 自增
	private String productId;// 产品id
	private String uri;// 地址
	private String pic;// 图纸封面地址
	private String format;// 图片格式 CAD BIM 3D
	private Integer isPicCreated;// 图片是否已生成 1.是 0.否
	private Date picCreatedDate;// 图片生成日期
	private String name;// 名称
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

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsPicCreated() {
		return isPicCreated;
	}

	public void setIsPicCreated(Integer isPicCreated) {
		this.isPicCreated = isPicCreated;
	}

	public Date getPicCreatedDate() {
		return picCreatedDate;
	}

	public void setPicCreatedDate(Date picCreatedDate) {
		this.picCreatedDate = picCreatedDate;
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
