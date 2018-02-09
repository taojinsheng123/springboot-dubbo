package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

public class HistoryParams extends PageParams {

	private String keyword;

	private Integer user;// 收藏人

	private Integer userScope;// 标识 0.前台 1.后台

	private Integer isDelete;// 是否删除 1.是

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getUserScope() {
		return userScope;
	}

	public void setUserScope(Integer userScope) {
		this.userScope = userScope;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
}
