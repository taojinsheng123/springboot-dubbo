package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_brand 实体类 Fri Jan 13 15:44:56 CST 2017 é³ä¸æ¹
 */

public class Brand {
	private Integer id;// 自增
	private String enterpriseName;// 企业名称
	private String brandId;// 品牌id
	private String name;// 品牌名称
	private String namePinyin;// 拼音
	private String nameFirstLetter;// 拼音的首字母
	private Integer type;// 分类 1.内资 2.外资
	private Integer flag;// 标识 0.为可以编辑版本 1.只读版本
	private String remark;//
	private String logo;// 品牌logo
	private Integer status;// 状态 0.待提交 1.已提交，待审核 2.已审核 10.审核退回
	private Integer createUser;// 创建人
	private Integer createUserScope;// 创建人类型 0.前台用户 1.后台用户
	private Date createDate;// 创建时间
	private Integer editUser;// 编辑人
	private Integer editUserScope;// 编辑人类型 0.前台用户 1.后台用户
	private Date editDate;// 编辑时间
	private Integer submitUser;// 提交人
	private Date submitDate;// 提交时间
	private Integer submitUserScope;// 提交人类型 0.前台用户 1.后台用户
	private Integer auditUser;// 审核人
	private String auditUserName;// 审核人账号
	private String auditUserTrueName;// 审核人真实姓名
	private Date auditDate;// 审核时间
	private Integer isDelete;// 是否删除 1.是
	private Integer deleteUser;// 删除人
	private Date deleteDate;// 删除时间
	private Integer seq;// 排序
	private Integer clickCount;// 点击次数
	private Integer level;// 级别
	private String levelName;// 级别名称

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNamePinyin(String namePinyin) {
		this.namePinyin = namePinyin;
	}

	public String getNamePinyin() {
		return namePinyin;
	}

	public void setNameFirstLetter(String nameFirstLetter) {
		this.nameFirstLetter = nameFirstLetter;
	}

	public String getNameFirstLetter() {
		return nameFirstLetter;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
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

	public void setSubmitUserScope(Integer submitUserScope) {
		this.submitUserScope = submitUserScope;
	}

	public Integer getSubmitUserScope() {
		return submitUserScope;
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

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Integer getClickCount() {
		return clickCount;
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
