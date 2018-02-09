package com.tcbci.gkit.business.domain.enterprise;

import java.util.Date;

/**
 * T_gb_enterprise_brand 实体类 Wed Nov 09 11:51:09 CST 2016 yuhuaqiu
 */

public class EnterpriseBrand {
	private Integer id;// 自增
	private String enterpriseId;// 企业id
	private String logo;// 品牌logo
	private String brandId;// 品牌id
	private String brandName;// 品牌名称
	private Integer type;// 类别 1.自有品牌 2.代理品牌
	private String certificate;// 品牌证书
	private Integer status;// 状态 0.待审核 1.已审核 10.审核退回
	private String remark;// 备注
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人账号
	private String auditUserTrueName;// 审核人真实姓名
	private Date auditDate;// 审核时间
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

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandId() {
		return brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
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
}
