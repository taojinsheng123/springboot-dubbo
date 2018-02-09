package com.tcbci.gkit.business.domain.enterprise;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * T_gb_enterprise 实体类 Mon Nov 07 18:19:36 CST 2016 yuhuaqiu
 */

public class Enterprise implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// 自增
	private Integer userId;// 所属用户
	private String userName;// 用户账号
	private String enterpriseId;// 企业id，此id为企业的真实id
	private String fullName;// 公司全名
	private String shortName;// 简称
	private String logo;// logo图片，绝对路径
	private String corporation;// 公司法人
	private String businessNature;// 业务性质
	private String businessNatureName;// 业务性质名称
	private String enterpriseNature;// 公司性质
	private String enterpriseNatureName;// 公司性质名称
	private Double registeredCapital;// 注册资本(万元)
	private Integer foundYear;// 成立年份
	private String majorBusiness;// 经营主营业务
	private String businessLicense;// 营业执照号
	private String supplierCategory;// 供应商类型
	private String supplierCategoryName;// 供应商类型名称
	private String introduction;// 公司介绍
	private String introductionText;// 公司介绍(纯文本)
	private Integer flag;// 标识 0.表示此版本为用户管理版本(用户编辑、审核的为此版本) 1.表示此版本为其它用户查看版本
	private String phonePrefix;// 电话前缀 86
	private String phoneCode;// 电话区号
	private String phoneNumber;// 电话号码
	private String phoneExt;// 分机号
	private String faxPrefix;// 传真前缀
	private String faxCode;// 传真区号
	private String faxNumber;// 传真号
	private String faxExt;// 分机号
	private String wexinMp;// 微信公众号
	private String website;// 网址
	private String email;// 企业邮箱
	private String countryCode;// 省
	private String countryName;// 省名称
	private String provinceCode;// 省
	private String provinceName;// 省名称
	private String cityCode;// 市
	private String cityName;// 市名称
	private String areaCode;// 县
	private String areaName;// 县名称
	private String address;// 地址
	private String employeeCount;// 员工数量
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer editUser;// 编辑人
	private Date editDate;// 编辑时间
	private Integer status;// 审核状态 0.待提交 1.已提交，待审核 2.已审核 10.审核退回
	private Integer submitUser;// 审核的提交人
	private Date submitDate;// 审核的提交时间
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人账号
	private String auditUserTrueName;// 审核人真实姓名
	private Date auditDate;// 审核时间
	private Integer isDelete;// 是否删除 1.是
	private Date deleteDate;// 删除时间
	private Integer deleteUser;// 删除人
	private Date timestamp;//
	private Integer clickCount;
	private Integer seq;// 综合排序
	private String qq;// qq
	private String hotline;// 服务热线
	private Integer power;// 当前用户权限 1.读写 0.只读
	private Integer createUserScope;// 创建人类型 0外网1内网
	private Integer submitUserScope;// 提交人类型 0外网1内网
	private Integer deleteUserScope;// 删除人类型 0外网1内网
	private Integer baseWeight;// 基础综合排序权重
	private Integer editUserScope;// 类型 0外网1内网
	private String registeredCapitalUnit;// 注册资本单位
	private Integer level;// 级别
	private String levelName;// 级别名称
	private Integer custRefid;// 建设网对应的企业id
	private Double annualOutput;// 年产量
	private String annualOutputUnit;// 单位
	private String scopeTip;
	private String marketId;
	private String marketFullName;

	public String getScopeTip() {
		return scopeTip;
	}

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String getMarketFullName() {
		return marketFullName;
	}

	public void setMarketFullName(String marketFullName) {
		this.marketFullName = marketFullName;
	}

	public void setScopeTip(String scopeTip) {
		this.scopeTip = scopeTip;
	}

	public Integer getCustRefid() {
		return custRefid;
	}

	public Double getAnnualOutput() {
		return annualOutput;
	}

	public void setAnnualOutput(Double annualOutput) {
		this.annualOutput = annualOutput;
	}

	public String getAnnualOutputUnit() {
		return annualOutputUnit;
	}

	public void setAnnualOutputUnit(String annualOutputUnit) {
		this.annualOutputUnit = annualOutputUnit;
	}

	public void setCustRefid(Integer custRefid) {
		this.custRefid = custRefid;
	}

	private List<EnterpriseServiceArea> enterpriseServiceAreaList;// 服务区域

	public String getRegisteredCapitalUnit() {
		return registeredCapitalUnit;
	}

	public void setRegisteredCapitalUnit(String registeredCapitalUnit) {
		this.registeredCapitalUnit = registeredCapitalUnit;
	}

	public Integer getEditUserScope() {
		return editUserScope;
	}

	public void setEditUserScope(Integer editUserScope) {
		this.editUserScope = editUserScope;
	}

	public String getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(String employeeCount) {
		this.employeeCount = employeeCount;
	}

	public Integer getClickCount() {
		return clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Integer getBaseWeight() {
		return baseWeight;
	}

	public void setBaseWeight(Integer baseWeight) {
		this.baseWeight = baseWeight;
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

	public Integer getDeleteUserScope() {
		return deleteUserScope;
	}

	public void setDeleteUserScope(Integer deleteUserScope) {
		this.deleteUserScope = deleteUserScope;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getHotline() {
		return hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public List<EnterpriseServiceArea> getEnterpriseServiceAreaList() {
		return enterpriseServiceAreaList;
	}

	public void setEnterpriseServiceAreaList(List<EnterpriseServiceArea> enterpriseServiceAreaList) {
		this.enterpriseServiceAreaList = enterpriseServiceAreaList;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getCorporation() {
		return corporation;
	}

	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}

	public String getBusinessNature() {
		return businessNature;
	}

	public void setBusinessNatureName(String businessNatureName) {
		this.businessNatureName = businessNatureName;
	}

	public String getBusinessNatureName() {
		return businessNatureName;
	}

	public void setEnterpriseNature(String enterpriseNature) {
		this.enterpriseNature = enterpriseNature;
	}

	public String getEnterpriseNature() {
		return enterpriseNature;
	}

	public void setEnterpriseNatureName(String enterpriseNatureName) {
		this.enterpriseNatureName = enterpriseNatureName;
	}

	public String getEnterpriseNatureName() {
		return enterpriseNatureName;
	}

	public void setRegisteredCapital(Double registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public Double getRegisteredCapital() {
		return registeredCapital;
	}

	public void setFoundYear(Integer foundYear) {
		this.foundYear = foundYear;
	}

	public Integer getFoundYear() {
		return foundYear;
	}

	public void setMajorBusiness(String majorBusiness) {
		this.majorBusiness = majorBusiness;
	}

	public String getMajorBusiness() {
		return majorBusiness;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setSupplierCategory(String supplierCategory) {
		this.supplierCategory = supplierCategory;
	}

	public String getSupplierCategory() {
		return supplierCategory;
	}

	public void setSupplierCategoryName(String supplierCategoryName) {
		this.supplierCategoryName = supplierCategoryName;
	}

	public String getSupplierCategoryName() {
		return supplierCategoryName;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroductionText(String introductionText) {
		this.introductionText = introductionText;
	}

	public String getIntroductionText() {
		return introductionText;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setPhonePrefix(String phonePrefix) {
		this.phonePrefix = phonePrefix;
	}

	public String getPhonePrefix() {
		return phonePrefix;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}

	public String getPhoneExt() {
		return phoneExt;
	}

	public void setFaxPrefix(String faxPrefix) {
		this.faxPrefix = faxPrefix;
	}

	public String getFaxPrefix() {
		return faxPrefix;
	}

	public void setFaxCode(String faxCode) {
		this.faxCode = faxCode;
	}

	public String getFaxCode() {
		return faxCode;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxExt(String faxExt) {
		this.faxExt = faxExt;
	}

	public String getFaxExt() {
		return faxExt;
	}

	public void setWexinMp(String wexinMp) {
		this.wexinMp = wexinMp;
	}

	public String getWexinMp() {
		return wexinMp;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
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

	public void setEditUser(Integer editUser) {
		this.editUser = editUser;
	}

	public Integer getEditUser() {
		return editUser;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setSubmitUser(Integer submitUser) {
		this.submitUser = submitUser;
	}

	public Integer getSubmitUser() {
		return submitUser;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Date getSubmitDate() {
		return submitDate;
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

	public void setDeleteUser(Integer deleteUser) {
		this.deleteUser = deleteUser;
	}

	public Integer getDeleteUser() {
		return deleteUser;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

}
