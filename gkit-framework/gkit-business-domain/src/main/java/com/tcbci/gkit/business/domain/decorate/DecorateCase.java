package com.tcbci.gkit.business.domain.decorate;

import java.util.Date;
import java.util.List;

/**
 * T_decorate_case 实体类 Tue Sep 05 21:23:39 CST 2017 heqichun
 */

public class DecorateCase {
	private Integer id;// 自增
	private String caseId;// 案例id
	private String decorateCompanyId;// 装修公司Id
	private String designersId;// 设计师Id
	private String projectName;// 案例名称
	private Integer style;// 风格：1，中式；2，北欧；3，宜家；4，现代简约
	private Integer type;// 类型：1，小户型；2，普通住宅；3，别墅；4，局部装修；等
	private String tags;// 标签|分隔
	private String area;// 面积
	private String cost;// 造价
	private String countryCode;// 国家
	private String countryName;// 国家名称
	private String provinceCode;// 省
	private String provinceName;// 省名称
	private String cityCode;// 市
	private String cityName;// 市名称
	private String areaCode;// 县
	private String areaName;// 县名称
	private String address;// 地址
	private String description;// 项目描述
	private String descriptionText;// 项目描述(纯文本)
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
	private Integer seq;// 排序
	private Integer createUserScope;// 标识 0.前台 1.后台
	private Integer editUserScope;// 标识 0.前台 1.后台
	private Integer submitUserScope;// 标识 0.前台 1.后台
	private Integer deleteUserScope;// 删除用户类型 0外网1内网
	private List<DecorateCasePicture> decorateCasePictureList;
	private String previewImage;

	public String getPreviewImage() {
		return previewImage;
	}

	public void setPreviewImage(String previewImage) {
		this.previewImage = previewImage;
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

	public void setDecorateCompanyId(String decorateCompanyId) {
		this.decorateCompanyId = decorateCompanyId;
	}

	public String getDecorateCompanyId() {
		return decorateCompanyId;
	}

	public void setDesignersId(String designersId) {
		this.designersId = designersId;
	}

	public String getDesignersId() {
		return designersId;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}

	public Integer getStyle() {
		return style;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTags() {
		return tags;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getCost() {
		return cost;
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

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setEditUserScope(Integer editUserScope) {
		this.editUserScope = editUserScope;
	}

	public Integer getEditUserScope() {
		return editUserScope;
	}

	public void setSubmitUserScope(Integer submitUserScope) {
		this.submitUserScope = submitUserScope;
	}

	public Integer getSubmitUserScope() {
		return submitUserScope;
	}

	public void setDeleteUserScope(Integer deleteUserScope) {
		this.deleteUserScope = deleteUserScope;
	}

	public Integer getDeleteUserScope() {
		return deleteUserScope;
	}

	public List<DecorateCasePicture> getDecorateCasePictureList() {
		return decorateCasePictureList;
	}

	public void setDecorateCasePictureList(List<DecorateCasePicture> decorateCasePictureList) {
		this.decorateCasePictureList = decorateCasePictureList;
	}

}
