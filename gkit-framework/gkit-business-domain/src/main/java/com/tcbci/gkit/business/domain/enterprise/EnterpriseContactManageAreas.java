package com.tcbci.gkit.business.domain.enterprise;

import java.util.Date;

/**
 * T_gb_enterprise_contact_manage_areas 实体类 Wed Jan 18 15:35:22 CST 2017
 * xukangjing
 */

public class EnterpriseContactManageAreas {
	private Integer id;// 自增
	private Integer contactId;// 联系人id
	private String provinceCodes;// 负责的省份，多个用竖线分隔
	private String provinceNames;// 负责人省份/大区，如华北 上海
	private Date createDate;// 创建时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setProvinceCodes(String provinceCodes) {
		this.provinceCodes = provinceCodes;
	}

	public String getProvinceCodes() {
		return provinceCodes;
	}

	public void setProvinceNames(String provinceNames) {
		this.provinceNames = provinceNames;
	}

	public String getProvinceNames() {
		return provinceNames;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
