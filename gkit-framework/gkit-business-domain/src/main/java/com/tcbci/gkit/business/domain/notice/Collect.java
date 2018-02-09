package com.tcbci.gkit.business.domain.notice;

import java.util.Date;

/**
 * T_gb_collect 实体类 Tue Nov 15 12:45:13 CST 2016 xukangjing
 */

public class Collect {
	private Integer id;// 自增
	private String targetId;// 收藏目标id
	private String targetType;// 收藏的类型，一般指表名
	private String targetTitle;// 收藏的标题
	private String relativePath;// 相对路径
	private Integer user;// 收藏人
	private Date createDate;// 收藏时间

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

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
