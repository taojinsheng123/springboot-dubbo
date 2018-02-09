package com.tcbci.gkit.business.domain.enterprise;

import java.util.Date;

/**
 * T_gb_enterprise_shop_ads 实体类 Wed Nov 16 16:17:53 CST 2016 xukangjing
 */

public class EnterpriseShopAds {
	private Integer id;// 自增
	private String enterpriseId;// 企业id
	private String path;// 图片路径
	private String title;// 显示的标题
	private Integer status;// 状态0.待审核 1.已审核 10.已退回
	private Integer isDisplay;// 是否显示 1.是
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer auditUser;// 审核人
	private Date auditDate;// 审核时间
	private Integer isDelete;// 是否删除 1.是
	private Integer deleteUser;// 删除人
	private Date deleteDate;// 删除时间
	private Integer createUserScope;// 创建人类型 0外网1内网
	private Integer deleteUserScope;// 删除人类型 0外网1内网

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

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

	public Integer getIsDisplay() {
		return isDisplay;
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
}
