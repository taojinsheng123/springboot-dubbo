package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

public class ProductParams extends PageParams {

	private String enterpiseId;// 企业id

	private Integer userId;// 用户id

	private String[] keywords;// 关键字

	private Integer status;// 状态 0.待提交 1.已提交，待审核 2.已审核 10.审核退回

	private Boolean isShelve;// 是否上架

	private Integer flag;// 类别 0.用户编辑版本 1.只读版本

	private Integer series;// 系列

	private String brand;// 品牌

	private String[] excludeProductIds;// 不包括的产品id

	public String getEnterpiseId() {
		return enterpiseId;
	}

	public void setEnterpiseId(String enterpiseId) {
		this.enterpiseId = enterpiseId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getIsShelve() {
		return isShelve;
	}

	public void setIsShelve(Boolean isShelve) {
		this.isShelve = isShelve;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getSeries() {
		return series;
	}

	public void setSeries(Integer series) {
		this.series = series;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String[] getExcludeProductIds() {
		return excludeProductIds;
	}

	public void setExcludeProductIds(String[] excludeProductIds) {
		this.excludeProductIds = excludeProductIds;
	}

}
