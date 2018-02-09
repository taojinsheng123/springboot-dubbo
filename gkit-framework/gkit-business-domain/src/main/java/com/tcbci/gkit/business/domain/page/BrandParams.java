package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

public class BrandParams extends PageParams {

	private String notEnterpriseId;// 排除的enterpriseID

	private String keyword;// 关键字

	private Integer status;// 状态 0.待提交 1.已提交，待审核 2.已审核 10.审核退回

	private Integer flag;// 0.为可以编辑版本 1.只读版本

	private String enterpriseId;// 企业id

	private Integer createUser;// 创建人，逻辑或

	private String brandId;

	public String getNotEnterpriseId() {
		return notEnterpriseId;
	}

	public void setNotEnterpriseId(String notEnterpriseId) {
		this.notEnterpriseId = notEnterpriseId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

}
