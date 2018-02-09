package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

/**
 * 企业资讯查询类
 * 
 * @author xukangjing
 *
 */
public class EnterpriseNewsParams extends PageParams {

	private String enterpriseId;// 企业id

	private String keyword;// 标题关键字

	private Integer isDelete;// 0,未,1已删

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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
