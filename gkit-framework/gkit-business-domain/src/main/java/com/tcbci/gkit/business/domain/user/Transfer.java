package com.tcbci.gkit.business.domain.user;

import java.util.Date;

/**
 * T_gb_transfer 实体类 Mon Dec 26 15:44:01 CST 2016 靳东方
 */

public class Transfer {
	private Integer id;// 自增
	private Integer isInvalid;// 是否无效 1.是
	private String entepriseId;// 企业id
	private Integer userId;// 用户id
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setIsInvalid(Integer isInvalid) {
		this.isInvalid = isInvalid;
	}

	public Integer getIsInvalid() {
		return isInvalid;
	}

	public void setEntepriseId(String entepriseId) {
		this.entepriseId = entepriseId;
	}

	public String getEntepriseId() {
		return entepriseId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
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
}
