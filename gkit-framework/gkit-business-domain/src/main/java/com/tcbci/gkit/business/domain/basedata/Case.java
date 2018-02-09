package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;
import java.util.List;

import com.tcbci.gkit.business.domain.product.Product;

/**
 * T_gb_case 实体类 Mon Nov 14 10:22:42 CST 2016 yuhuaqiu
 */

public class Case {
	private Integer id;// 自增
	private String caseId;// 案例id
	private String enterpriseId;//
	private String projectName;// 项目名称
	private String firstParty;// 甲方
	private Double contractTotal;// 合同总额
	private String scale;// 项目规模
	private String countryCode;//
	private String countryName;// 国家名称
	private String provinceCode;// 省
	private String provinceName;// 省名称
	private String cityCode;// 市
	private String cityName;// 城市
	private String address;// 地址
	private String description;// 项目描述
	private String descriptionText;// 项目描述(纯文本)
	private String images;// 项目图片，多个 用坚线分隔
	private String contractSimple;// 合同图片，多个用竖线分隔
	private Integer flag;// 标识 0.表示此版本为用户管理版本(用户编辑、审核的为此版本) 1.表示此版本为其它用户查看版本
	private Integer isHidden;// 是否隐藏 1.是 0.否
	private Integer status;// 状态 0.待提交 1.已提交待审核 2.已审核 10.已退回
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer editUser;// 更新人
	private Date editDate;// 更新时间
	private Integer submitUser;// 提交人
	private Date submitDate;// 提交时间
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人
	private String auditUserTrueName;// 审核人真实账号
	private Date auditDate;// 审核时间
	private Integer isDelete;// 是否删除 1.是
	private Integer deleteUser;// 删除人
	private Date deleteDate;// 删除时间
	private Integer baseWeight;// 基础综合排序权重
	private Integer seq;// 综合排序
	private Integer clickCount;// 点击次数
	private Integer createUserScope;// 创建人类型 0外网1内网
	private Integer submitUserScope;// 提交人类型 0外网1内网
	private Integer editUserScope;// 类型 0外网1内网

	private List<CaseProjectCategory> caseProjectCategoryList;// 案例项目的所属分类

	private List<Product> caseProductList;// 案例产品列表

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

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

	public Integer getBaseWeight() {
		return baseWeight;
	}

	public void setBaseWeight(Integer baseWeight) {
		this.baseWeight = baseWeight;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getClickCount() {
		return clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public List<CaseProjectCategory> getCaseProjectCategoryList() {
		return caseProjectCategoryList;
	}

	public void setCaseProjectCategoryList(List<CaseProjectCategory> caseProjectCategoryList) {
		this.caseProjectCategoryList = caseProjectCategoryList;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setFirstParty(String firstParty) {
		this.firstParty = firstParty;
	}

	public String getFirstParty() {
		return firstParty;
	}

	public void setContractTotal(Double contractTotal) {
		this.contractTotal = contractTotal;
	}

	public Double getContractTotal() {
		return contractTotal;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
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

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
	}

	public String getDescriptionText() {
		return descriptionText;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getImages() {
		return images;
	}

	public void setContractSimple(String contractSimple) {
		this.contractSimple = contractSimple;
	}

	public String getContractSimple() {
		return contractSimple;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setIsHidden(Integer isHidden) {
		this.isHidden = isHidden;
	}

	public Integer getIsHidden() {
		return isHidden;
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

	public List<Product> getCaseProductList() {
		return caseProductList;
	}

	public void setCaseProductList(List<Product> caseProductList) {
		this.caseProductList = caseProductList;
	}

	public String getFirstImage() {
		if (this.images == null || this.images.length() == 0) {
			return null;
		}
		String[] array = this.images.split("\\|");
		return array.length != 0 ? array[0] : null;
	}
}
