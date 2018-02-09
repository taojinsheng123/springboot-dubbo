package com.tcbci.gkit.business.page;

import java.util.Date;

/**
 * MaterialMarket(审核查询页)搜索参数
 * 
 * @author tjs
 *
 */
public class MaterialMarketParams extends PageParams {

	private String[] keywords;// 关键字(企业名称,ID)

	private String[] materialMarketIds;

	private Integer status;// 审核状态 0.待提交 1.已提交，待审核 2.已审核 10.审核退回

	private Date submitStartDate;// 审核提交开始时间

	private Date submitEndDate;// 审核提交结束时间

	private Date auditStartDate;// 审核时间开始

	private Date auditEndDate;// 审核时间结束

	private Integer createUser;// 创建人

	private Integer editUser;// 编辑人

	private Integer auditUser;// 审核人

	private Integer createUserScope;// 创建人 0.前台用户创建 1.后台内部用户创建

	private Date createStartDate;// 创建开始时间

	private Date createEndDate;// 创建结束时间

	private Date editStartDate;// 修改开始时间

	private String[] provinces;// 省code

	private String[] citys;// 市code

	private String address;// 详细地址

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public String[] getMaterialMarketIds() {
		return materialMarketIds;
	}

	public void setMaterialMarketIds(String[] materialMarketIds) {
		this.materialMarketIds = materialMarketIds;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getSubmitStartDate() {
		return submitStartDate;
	}

	public void setSubmitStartDate(Date submitStartDate) {
		this.submitStartDate = submitStartDate;
	}

	public Date getSubmitEndDate() {
		return submitEndDate;
	}

	public void setSubmitEndDate(Date submitEndDate) {
		this.submitEndDate = submitEndDate;
	}

	public Date getAuditStartDate() {
		return auditStartDate;
	}

	public void setAuditStartDate(Date auditStartDate) {
		this.auditStartDate = auditStartDate;
	}

	public Date getAuditEndDate() {
		return auditEndDate;
	}

	public void setAuditEndDate(Date auditEndDate) {
		this.auditEndDate = auditEndDate;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getEditUser() {
		return editUser;
	}

	public void setEditUser(Integer editUser) {
		this.editUser = editUser;
	}

	public Integer getAuditUser() {
		return auditUser;
	}

	public void setAuditUser(Integer auditUser) {
		this.auditUser = auditUser;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

	public Date getCreateStartDate() {
		return createStartDate;
	}

	public void setCreateStartDate(Date createStartDate) {
		this.createStartDate = createStartDate;
	}

	public Date getCreateEndDate() {
		return createEndDate;
	}

	public void setCreateEndDate(Date createEndDate) {
		this.createEndDate = createEndDate;
	}

	public Date getEditStartDate() {
		return editStartDate;
	}

	public void setEditStartDate(Date editStartDate) {
		this.editStartDate = editStartDate;
	}

	public String[] getProvinces() {
		return provinces;
	}

	public void setProvinces(String[] provinces) {
		this.provinces = provinces;
	}

	public String[] getCitys() {
		return citys;
	}

	public void setCitys(String[] citys) {
		this.citys = citys;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
