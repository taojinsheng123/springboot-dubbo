package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

public class SampleParams extends PageParams {

	private String[] enterpriseId;// 企业id

	private String[] keyword;// 样本名称关键字

	private Integer status;// 状态 0.待审核 1.已审核 10.审核退回

	private String productId;// 产品Id

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String[] getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String[] enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String[] getKeyword() {
		return keyword;
	}

	public void setKeyword(String[] keyword) {
		this.keyword = keyword;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
