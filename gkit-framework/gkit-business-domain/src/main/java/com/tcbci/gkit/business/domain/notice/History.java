package com.tcbci.gkit.business.domain.notice;

import java.util.Date;

/**
 * T_gb_history 实体类 Tue Nov 15 12:46:34 CST 2016 xukangjing
 */

public class History {
	private Integer id;// 主键
	private String targetId;// 浏览目标的id
	private String targetType;// 浏览对象的分类 一般指表名
	private String targetTitle;// 收藏标题
	private String relativePath;// 相对路径
	private Integer user;// 收藏人
	private Integer userScope;// 标识 0.前台 1.后台
	private Date lastViewDate;// 最后一次浏览时间
	private Date createDate;// 创建时间
	private Integer isDelete;// 是否删除 1.是
	private Date deleteDate;// 删除时间
	private String userIp;// 用户ip
	private String facilityType;// 设备类型

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getFacilityType() {
		return facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}

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

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetTitle(String targetTitle) {
		this.targetTitle = targetTitle;
	}

	public String getTargetTitle() {
		return targetTitle;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

	public String getRelativePath() {
		return relativePath;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getUser() {
		return user;
	}

	public Integer getUserScope() {
		return userScope;
	}

	public void setUserScope(Integer userScope) {
		this.userScope = userScope;
	}

	public void setLastViewDate(Date lastViewDate) {
		this.lastViewDate = lastViewDate;
	}

	public Date getLastViewDate() {
		return lastViewDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
}
