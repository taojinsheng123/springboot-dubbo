package com.tcbci.gkit.business.domain.enterprise;

import java.util.Date;

/**
 * T_gb_enterprise_news 实体类 Thu Nov 17 09:07:31 CST 2016 xukangjing
 */

public class EnterpriseNews {
	private Integer id;// 自增
	private String enterpriseId;// 企业id
	private String title;// 标题
	private String images;// 图片，多个用竖线分隔
	private String summary;// 内容简介
	private String content;// 内容
	private String contentText;// 纯文本
	private Integer isTop;// 是否置顶，1是
	private Date topDate;// 置顶时间
	private Integer clickCount;// 点击次数
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer isDelete;// 是否删除 1.是
	private Integer deleteUser;// 删除人
	private Date deleteDate;// 删除时间
	private Integer createUserScope;// 创建人类型 0外网1内网
	private Integer deleteUserScope;// 删除人类型 0外网1内网
	private Integer editUser;// 编辑人
	private Integer editUserScope;// 类型 0外网1内网
	private Date editDate;// 编辑时间

	public Integer getEditUser() {
		return editUser;
	}

	public void setEditUser(Integer editUser) {
		this.editUser = editUser;
	}

	public Integer getEditUserScope() {
		return editUserScope;
	}

	public void setEditUserScope(Integer editUserScope) {
		this.editUserScope = editUserScope;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Date getTopDate() {
		return topDate;
	}

	public void setTopDate(Date topDate) {
		this.topDate = topDate;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

	public Integer getDeleteUserScope() {
		return deleteUserScope;
	}

	public void setDeleteUserScope(Integer deleteUserScope) {
		this.deleteUserScope = deleteUserScope;
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

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getImages() {
		return images;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		return summary;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	public String getContentText() {
		return contentText;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}

	public Integer getIsTop() {
		return isTop;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Integer getClickCount() {
		return clickCount;
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

	public String getFirstImage() {
		if (this.images == null || this.images.length() == 0) {
			return null;
		}

		return this.images.split("\\|")[0];
	}
}
