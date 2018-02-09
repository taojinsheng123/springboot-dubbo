package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

public class EnterpriseParams extends PageParams {

	private String fullName;// 公司全名

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
