package com.tcbci.gkit.business.domain.enterprise;

import java.util.Date;

/**
 * T_gb_enterprise_honor 实体类 Tue Nov 08 18:08:00 CST 2016 yuhuaqiu
 */

public class EnterpriseHonor {
	private Integer id;// 自增
	private String enterpriseId;// 企业id
	private String flag;// 标识 HONOR:荣誉 LICENSE:营业执照 OTHER:其它
	private String name;// 名称
	private String certificate;// 证书地址
	private Integer status;// 状态 0.待审核 1.已审核 10.已退回
	private String remark;// 备注
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人名称
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

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getFlag() {
		return flag;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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
