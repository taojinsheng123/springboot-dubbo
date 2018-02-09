package com.tcbci.gkit.business.domain.product;

import java.util.Date;

/**
 * T_gb_product_series 产品系列实体类 Tue Feb 07 16:03:40 CST 2017 xukangjing
 */

public class ProductSeries {
	private Integer id;// 自增
	private String enterpriseId;// 企业id
	private String name;// 系列名称
	private Integer seq;// 排序
	private Integer isDelete;// 是否删除 1.是
	private Integer createUser;// 创建人
	private Integer createUserScope;// 标识 0.前台 1.后台
	private Date createDate;// 创建时间
	private Integer editUser;// 编辑人
	private Integer editUserScope;// 标识 0.前台 1.后台
	private Date editDate;// 编辑时间
	private Integer deleteUser;// 删除人
	private Integer deleteUserScope;// 标识 0.前台 1.后台
	private Date deleteDate;// 删除时间

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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
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

	public void setEditUserScope(Integer editUserScope) {
		this.editUserScope = editUserScope;
	}

	public Integer getEditUserScope() {
		return editUserScope;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setDeleteUser(Integer deleteUser) {
		this.deleteUser = deleteUser;
	}

	public Integer getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUserScope(Integer deleteUserScope) {
		this.deleteUserScope = deleteUserScope;
	}

	public Integer getDeleteUserScope() {
		return deleteUserScope;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}
}
