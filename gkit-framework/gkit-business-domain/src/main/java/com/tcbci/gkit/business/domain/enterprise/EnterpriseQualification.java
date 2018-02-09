package com.tcbci.gkit.business.domain.enterprise;

import java.util.Date;

/**
 * T_gb_enterprise_qualification 实体类 Tue Nov 08 15:55:08 CST 2016 yuhuaqiu
 */

public class EnterpriseQualification {
	private Integer id;// 自增
	private String enterpriseId;// 企业id
	private Integer qualificationId;// 服务资质id
	private String qualificationPath;// 资质路径
	private String qualificationName;// 资质名称
	private String certificate;// 资质证书
	private String remark;// 备注说明
	private Integer status;// 状态 0.待审核 1.已审核 10.审核退回
	private Integer createUser;// 创建人
	private Date createDate;// 创建日期
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人账号
	private String auditUserTrueName;// 审核真实姓名
	private Date auditDate;// 审核日期
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

	public void setQualificationId(Integer qualificationId) {
		this.qualificationId = qualificationId;
	}

	public Integer getQualificationId() {
		return qualificationId;
	}

	public void setQualificationPath(String qualificationPath) {
		this.qualificationPath = qualificationPath;
	}

	public String getQualificationPath() {
		return qualificationPath;
	}

	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	public String getQualificationName() {
		return qualificationName;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
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
