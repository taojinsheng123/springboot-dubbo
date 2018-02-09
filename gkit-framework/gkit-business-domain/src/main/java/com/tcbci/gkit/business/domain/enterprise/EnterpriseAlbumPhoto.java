package com.tcbci.gkit.business.domain.enterprise;

import java.util.Date;

/**
 * T_gb_enterprise_album_photo 实体类 Wed Nov 09 17:25:20 CST 2016 yuhuaqiu
 */

public class EnterpriseAlbumPhoto {
	private Integer id;// 自增
	private Integer albumId;// 封面id
	private String path;// 图片地址
	private String description;// 图片说明
	private Date createDate;// 创建时间
	private Integer status;// 状态 0.待审核 1.已审核 10.已退回
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人账号
	private String auditUserTrueName;// 审核人真实姓名
	private Date auditDate;// 审核时间
	private Integer createUser;// 创建人
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

	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}

	public Integer getAlbumId() {
		return albumId;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAuditUser() {
		return auditUser;
	}

	public void setAuditUser(Integer auditUser) {
		this.auditUser = auditUser;
	}

	public String getAuditUserName() {
		return auditUserName;
	}

	public void setAuditUserName(String auditUserName) {
		this.auditUserName = auditUserName;
	}

	public String getAuditUserTrueName() {
		return auditUserTrueName;
	}

	public void setAuditUserTrueName(String auditUserTrueName) {
		this.auditUserTrueName = auditUserTrueName;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

}
