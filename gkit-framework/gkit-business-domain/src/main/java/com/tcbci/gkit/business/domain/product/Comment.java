package com.tcbci.gkit.business.domain.product;

import java.util.Date;

/**
 * T_gb_comment 实体类 Tue Nov 29 10:56:07 CST 2016 yuhuaqiu
 */

public class Comment {
	private Integer id;// 自增
	private String targetId;// 目标id
	private Integer targetType;// 目标类型 1.产品
	private Integer refId;// 引用的评论id，无则为0
	private String content;// 评论内容
	private Integer star;// 评星 1-5
	private String refPath;// 引用路径 1.2.
	private Integer status;// 状态 0.待审核 1.已审核 10.审核退回
	private Integer createUser;// 创建人
	private String createUserName;// 创建人的账号
	private String createUserPhoto;// 创建人的头像
	private Date createDate;// 创建时间
	private Integer isDelete;// 是否已删除 1.是 0.否
	private Date deleteDate;// 删除时间
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人账号
	private String auditUserTrueName;// 审核人真实账号
	private Date auditDate;// 审核时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetType(Integer targetType) {
		this.targetType = targetType;
	}

	public Integer getTargetType() {
		return targetType;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public Integer getRefId() {
		return refId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public Integer getStar() {
		return star;
	}

	public void setRefPath(String refPath) {
		this.refPath = refPath;
	}

	public String getRefPath() {
		return refPath;
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

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserPhoto(String createUserPhoto) {
		this.createUserPhoto = createUserPhoto;
	}

	public String getCreateUserPhoto() {
		return createUserPhoto;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
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
