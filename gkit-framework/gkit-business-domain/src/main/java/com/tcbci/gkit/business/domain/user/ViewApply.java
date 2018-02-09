package com.tcbci.gkit.business.domain.user;

import java.util.Date;

/**
 * T_gb_view_apply 实体类 Tue Dec 27 17:15:42 CST 2016 xukangjing
 */

public class ViewApply {
	private Integer id;// 自增
	private Integer userId;// 申请人账号
	private String userName;// 用户账号
	private String userTrueName;// 用户真实姓名
	private String userMobile;// 用户手机号
	private String enterpriseName;// 公司名称
	private String userEmail;// 用户邮箱
	private Integer status;// 0.待审核 1.审核通过 10.审核不通过
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private String auditRemark;// 审核备注
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人名称
	private String auditUserTrueName;// 审核人真实名称
	private Date auditDate;// 审核时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}

	public String getUserTrueName() {
		return userTrueName;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserEmail() {
		return userEmail;
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

	public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}

	public String getAuditRemark() {
		return auditRemark;
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
