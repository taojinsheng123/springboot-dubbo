package com.tcbci.gkit.business.domain.enterprise;

/**
 * 统计数据
 * 
 * @author dongfang
 *
 */
public class Statistics {
	/**
	 * 绿色材库上传的产品总数量
	 */
	private int totalProductCount;

	/**
	 * 绿色材库案例的总数量
	 */
	private int totalCaseCount;

	/**
	 * 绿色材库企业数量
	 */
	private int totalEnterpriseCount;

	public int getTotalProductCount() {
		return totalProductCount;
	}

	public void setTotalProductCount(int totalProductCount) {
		this.totalProductCount = totalProductCount;
	}

	public int getTotalCaseCount() {
		return totalCaseCount;
	}

	public void setTotalCaseCount(int totalCaseCount) {
		this.totalCaseCount = totalCaseCount;
	}

	public int getTotalEnterpriseCount() {
		return totalEnterpriseCount;
	}

	public void setTotalEnterpriseCount(int totalEnterpriseCount) {
		this.totalEnterpriseCount = totalEnterpriseCount;
	}
}
