package com.tcbci.gkit.business.domain.product;

import java.util.Date;

/**
 * T_gb_product_certification 实体类 Tue Nov 15 17:18:27 CST 2016 yuhuaqiu
 */

public class ProductCertification {
	private Integer id;// 自增
	private String productId;// 产品id
	private Integer flag;// 0.编辑版本 1.只读版本
	private Integer certificationId;// 认证id
	private String path;// 证书路径
	private String images;// 认证图片 ，多个用竖线分隔
	private String certificationName;// 证书名称
	private Date createDate;// 创建时间

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
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

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setCertificationId(Integer certificationId) {
		this.certificationId = certificationId;
	}

	public Integer getCertificationId() {
		return certificationId;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getCertificationName() {
		return certificationName;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
