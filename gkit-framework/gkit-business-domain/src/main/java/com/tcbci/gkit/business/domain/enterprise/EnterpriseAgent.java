package com.tcbci.gkit.business.domain.enterprise;

import java.util.Date;

/**
 * T_gb_enterprise_agent 实体类 Fri Nov 25 13:20:42 CST 2016 yuhuaqiu
 */

public class EnterpriseAgent {
	private Integer id;// 自增
	private String enterpriseId;// 企业id
	private String agentEnterpriseId;// 代理商企业id
	private String agentEnterpriseName;// 代理商企业名称
	private String brandIds;// 品牌id集合，多个用竖线线分隔
	private String brandNames;// 代理的品牌多个用竖线分隔
	private String provinceCodes;// 代理区域-1 表示全国
	private Integer status;// 状态 0.待审核 1.已提交 10.已退回
	private String remark;// 备注
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer auditUser;// 更新人
	private String auditUserName;// 审核人账号
	private String auditUserTrueName;// 审核人真实姓名
	private Date auditDate;// 审核时间
	private String provinceNames;// 代理区域
	private Integer createUserScope;// 创建人类型 0外网1内网
	private Integer editUser;// 修改人
	private Date editDate;// 修改时间
	private Integer editUserScope;// 修改人类型 0外网1内网

	public Integer getEditUser() {
		return editUser;
	}

	public void setEditUser(Integer editUser) {
		this.editUser = editUser;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Integer getEditUserScope() {
		return editUserScope;
	}

	public void setEditUserScope(Integer editUserScope) {
		this.editUserScope = editUserScope;
	}

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

	public void setAgentEnterpriseId(String agentEnterpriseId) {
		this.agentEnterpriseId = agentEnterpriseId;
	}

	public String getAgentEnterpriseId() {
		return agentEnterpriseId;
	}

	public String getAgentEnterpriseName() {
		return agentEnterpriseName;
	}

	public void setAgentEnterpriseName(String agentEnterpriseName) {
		this.agentEnterpriseName = agentEnterpriseName;
	}

	public void setBrandIds(String brandIds) {
		this.brandIds = brandIds;
	}

	public String getBrandIds() {
		return brandIds;
	}

	public void setBrandNames(String brandNames) {
		this.brandNames = brandNames;
	}

	public String getBrandNames() {
		return brandNames;
	}

	public void setProvinceCodes(String provinceCodes) {
		this.provinceCodes = provinceCodes;
	}

	public String getProvinceCodes() {
		return provinceCodes;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setAuditUser(Integer auditUser) {
		this.auditUser = auditUser;
	}

	public Integer getAuditUser() {
		return auditUser;
	}

	public void setAuditUserName(String auditUserName) {
		this.auditUserName = auditUserName;
	}

	public String getAuditUserName() {
		return auditUserName;
	}

	public void setAuditUserTrueName(String auditUserTrueName) {
		this.auditUserTrueName = auditUserTrueName;
	}

	public String getAuditUserTrueName() {
		return auditUserTrueName;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setProvinceNames(String provinceNames) {
		this.provinceNames = provinceNames;
	}

	public String getProvinceNames() {
		return provinceNames;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}
}
