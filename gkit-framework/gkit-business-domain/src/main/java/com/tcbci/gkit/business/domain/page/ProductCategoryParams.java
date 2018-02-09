package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

public class ProductCategoryParams extends PageParams {

	private String[] keyword;// 关键字

	private Integer parentId;// 父级id

	private String parentPath;// 父级编码

	private Integer enable;// 是否启用1.是

	public String[] getKeyword() {
		return keyword;
	}

	public void setKeyword(String[] keyword) {
		this.keyword = keyword;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getParentPath() {
		return parentPath;
	}

	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

}
