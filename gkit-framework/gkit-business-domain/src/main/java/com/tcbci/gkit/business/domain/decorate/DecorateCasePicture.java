package com.tcbci.gkit.business.domain.decorate;

import java.util.Date;

/**
 * T_decorate_case_picture 实体类 Tue Sep 05 20:23:43 CST 2017 heqichun
 */

public class DecorateCasePicture {
	private Integer id;// 自增
	private String caseId;// 装修案例id
	private Integer flag;// 标识：0，客厅；1，卧室；2，厨房；3，卫生间；4，大厅；5，过道；6，包厢；7，客房；
	private String name;// 名称
	private String url;// 图片路径
	private Integer status;// 状态 0.待提交 1.已提交待审核 2.已审核 10.已退回
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer editUser;// 更新人
	private Date editDate;// 更新时间
	private Integer submitUser;// 提交人
	private Date submitDate;// 提交时间
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人
	private String auditUserTrueName;// 审核人真实账号
	private Date auditDate;// 审核时间
	private Integer isDelete;// 是否删除 1.是
	private Integer deleteUser;// 删除人
	private Date deleteDate;// 删除时间
	private Integer seq;// 排序
	private Integer createUserScope;// 标识 0.前台 1.后台
	private Integer editUserScope;// 标识 0.前台 1.后台
	private Integer submitUserScope;// 标识 0.前台 1.后台
	private Integer deleteUserScope;// 删除用户类型 0外网1内网

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
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

	public void setEditUser(Integer editUser) {
		this.editUser = editUser;
	}

	public Integer getEditUser() {
		return editUser;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setSubmitUser(Integer submitUser) {
		this.submitUser = submitUser;
	}

	public Integer getSubmitUser() {
		return submitUser;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Date getSubmitDate() {
		return submitDate;
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

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setDeleteUser(Integer deleteUser) {
		this.deleteUser = deleteUser;
	}

	public Integer getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setEditUserScope(Integer editUserScope) {
		this.editUserScope = editUserScope;
	}

	public Integer getEditUserScope() {
		return editUserScope;
	}

	public void setSubmitUserScope(Integer submitUserScope) {
		this.submitUserScope = submitUserScope;
	}

	public Integer getSubmitUserScope() {
		return submitUserScope;
	}

	public void setDeleteUserScope(Integer deleteUserScope) {
		this.deleteUserScope = deleteUserScope;
	}

	public Integer getDeleteUserScope() {
		return deleteUserScope;
	}
}
