package com.tcbci.gkit.business.domain.enterprise;

import java.io.Serializable;
import java.util.Date;

/**
 * T_gb_enterprise_service_area 实体类 Mon Nov 28 10:05:31 CST 2016 yuhuaqiu
 */

public class EnterpriseServiceArea implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// 自增
	private String enterpriseId;// 企业id
	private Integer flag;// 同t_gb_enterprise
	private String provinceCode;// 省
	private String provinceName;// 省名称
	private String cityCode;//
	private String cityName;//
	private Date createDate;// 创建时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
