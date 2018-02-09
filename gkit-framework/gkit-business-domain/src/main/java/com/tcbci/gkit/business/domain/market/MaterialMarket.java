package com.tcbci.gkit.business.domain.market;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.tcbci.gkit.business.domain.basedata.Brand;

/**
 * T_gb_enterprise 实体类 Mon Nov 07 18:19:36 CST 2016 yuhuaqiu
 */

public class MaterialMarket implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// 自增
	private String marketId;//
	private String fullName;// 建材市场全名
	private String shortName;// 简称
	private String logo;// logo图片，绝对路径
	private String marketFocusImage;// 焦点图
	private String provinceCode;// 省
	private String provinceName;// 省名称
	private String cityCode;// 市
	private String cityName;// 市名称
	private String areaCode;// 县
	private String areaName;// 县名称
	private String address;// 地址
	private Integer foundYear;// 成立年份
	private String introduction;// 公司介绍
	private String introductionText;// 公司介绍(纯文本)
	private Integer createUser;// 创建人
	private Integer auditUser;// 审核人
	// private Integer submitUser;// 审核的提交人
	private Integer editUser;// 编辑人
	private Integer deleteUser;// 删除人
	// private Integer flag;// 标识 0.表示此版本为用户管理版本(用户编辑、审核的为此版本) 1.表示此版本为其它用户查看版本
	private String createUserName;// 审核人账号
	private String auditUserName;// 审核人账号
	private String editUserName;
	// private String submitUserName;
	private String deleteUserName;
	private String createUserTrueName;// 审核人真实姓名
	private String auditUserTrueName;// 审核人真实姓名
	private String editUserTrueName;// 审核人真实姓名
	// private String submitUserTrueName;// 审核人真实姓名
	private String deleteUserTrueName;// 审核人真实姓名
	private Date createDate;// 创建时间
	// private Date submitDate;// 审核的提交时间
	private Date auditDate;// 审核时间
	private Date editDate;// 编辑时间
	private Date deleteDate;// 删除时间
	private Integer status;// 审核状态 0.待提交 1.已提交，待审核 2.已审核 10.审核退回
	private Integer createUserScope;// 创建人类型 0外网1内网
	private Integer submitUserScope;// 提交人类型 0外网1内网
	private Integer editUserScope;// 类型 0外网1内网
	private Integer deleteUserScope;// 删除人类型 0外网1内网
	private Integer baseWeight;// 基础综合排序权重
	private String hotline;// 服务热线
	private String contact;// 服务热线
	private String contactPhoneNumber;// 服务热线
	private Integer seq;// 综合排序
	private Integer isDelete;// 是否删除 1.是
	private String website;// 网址
	private Double latitude;// 纬度
	private Double longitude;// 经度
	private String email;
	private List<Brand> brandList;

	public List<Brand> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<Brand> brandList) {
		this.brandList = brandList;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMarketFocusImage() {
		return marketFocusImage;
	}

	public void setMarketFocusImage(String marketFocusImage) {
		this.marketFocusImage = marketFocusImage;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getFoundYear() {
		return foundYear;
	}

	public void setFoundYear(Integer foundYear) {
		this.foundYear = foundYear;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getIntroductionText() {
		return introductionText;
	}

	public void setIntroductionText(String introductionText) {
		this.introductionText = introductionText;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getAuditUser() {
		return auditUser;
	}

	public void setAuditUser(Integer auditUser) {
		this.auditUser = auditUser;
	}

	public Integer getEditUser() {
		return editUser;
	}

	public void setEditUser(Integer editUser) {
		this.editUser = editUser;
	}

	public Integer getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(Integer deleteUser) {
		this.deleteUser = deleteUser;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getAuditUserName() {
		return auditUserName;
	}

	public void setAuditUserName(String auditUserName) {
		this.auditUserName = auditUserName;
	}

	public String getEditUserName() {
		return editUserName;
	}

	public void setEditUserName(String editUserName) {
		this.editUserName = editUserName;
	}

	public String getDeleteUserName() {
		return deleteUserName;
	}

	public void setDeleteUserName(String deleteUserName) {
		this.deleteUserName = deleteUserName;
	}

	public String getCreateUserTrueName() {
		return createUserTrueName;
	}

	public void setCreateUserTrueName(String createUserTrueName) {
		this.createUserTrueName = createUserTrueName;
	}

	public String getAuditUserTrueName() {
		return auditUserTrueName;
	}

	public void setAuditUserTrueName(String auditUserTrueName) {
		this.auditUserTrueName = auditUserTrueName;
	}

	public String getEditUserTrueName() {
		return editUserTrueName;
	}

	public void setEditUserTrueName(String editUserTrueName) {
		this.editUserTrueName = editUserTrueName;
	}

	public String getDeleteUserTrueName() {
		return deleteUserTrueName;
	}

	public void setDeleteUserTrueName(String deleteUserTrueName) {
		this.deleteUserTrueName = deleteUserTrueName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

	public Integer getSubmitUserScope() {
		return submitUserScope;
	}

	public void setSubmitUserScope(Integer submitUserScope) {
		this.submitUserScope = submitUserScope;
	}

	public Integer getEditUserScope() {
		return editUserScope;
	}

	public void setEditUserScope(Integer editUserScope) {
		this.editUserScope = editUserScope;
	}

	public Integer getDeleteUserScope() {
		return deleteUserScope;
	}

	public void setDeleteUserScope(Integer deleteUserScope) {
		this.deleteUserScope = deleteUserScope;
	}

	public Integer getBaseWeight() {
		return baseWeight;
	}

	public void setBaseWeight(Integer baseWeight) {
		this.baseWeight = baseWeight;
	}

	public String getHotline() {
		return hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
