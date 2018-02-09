package com.tcbci.gkit.business.domain.market;

import java.io.Serializable;

/**
 * T_gb_enterprise 实体类 Mon Nov 07 18:19:36 CST 2016 yuhuaqiu
 */

public class MarketEnterprise implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// 自增
	private String marketId;
	private String enterpriseId;
	private String marketFullName;// 建材市场全名
	private String enterpriseFullName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getMarketFullName() {
		return marketFullName;
	}

	public void setMarketFullName(String marketFullName) {
		this.marketFullName = marketFullName;
	}

	public String getEnterpriseFullName() {
		return enterpriseFullName;
	}

	public void setEnterpriseFullName(String enterpriseFullName) {
		this.enterpriseFullName = enterpriseFullName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
