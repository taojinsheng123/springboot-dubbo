package com.tcbci.gkit.business.domain.enterprise;

/**
 * 企业数据统计
 * 
 * @author dongfang
 *
 */
public class EnterpriseStatistics extends Statistics {
	private String enterpriseId;

	/**
	 * 企业上传的产品数量
	 */
	private int productCount;

	/**
	 * 企业上传的案例数量
	 */
	private int caseCount;

	/**
	 * 企业上传的资讯数量
	 */
	private int newsCount;

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getCaseCount() {
		return caseCount;
	}

	public void setCaseCount(int caseCount) {
		this.caseCount = caseCount;
	}

	public int getNewsCount() {
		return newsCount;
	}

	public void setNewsCount(int newsCount) {
		this.newsCount = newsCount;
	}
}
