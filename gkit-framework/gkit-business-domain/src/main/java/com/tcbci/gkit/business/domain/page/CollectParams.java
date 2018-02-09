package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

public class CollectParams extends PageParams {

	private Integer user;// 收藏人
	private String targetType;// 收藏的类型，一般指表名
	private String[] targetIds;// 收藏对象id

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String[] getTargetIds() {
		return this.targetIds;
	}

	public void setTargetIds(String[] targetIds) {
		this.targetIds = targetIds;
	}
}
