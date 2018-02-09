package com.tcbci.gkit.business.domain.decorate;

/**
 * T_designer 实体类 Tue Sep 05 21:02:34 CST 2017 heqichun
 */

public class Designer {
	private Integer id;// 自增
	private Integer designerId;// 设计师Id
	private String decorateCompanyId;// 装修公司ID
	private String positionName;// 职位
	private String designerName;// 姓
	private String photo;// 头像
	private String title;// 称谓：男士、女士
	private Integer workingYears;// 工作年限
	private String email;// 邮箱
	private String qq;// qq
	private String weinxin;// 微信
	private String profile;// 个人简介（html）
	private String profileText;// 个人简介(纯文本)
	private String phoneNumber;// 电话号码
	private String moblieNubmer;// 手机号码
	private Integer isDelete;// 是否删除 1.是

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public Integer getDesignerId() {
		return designerId;
	}

	public void setDesignerId(Integer designerId) {
		this.designerId = designerId;
	}

	public void setDecorateCompanyId(String decorateCompanyId) {
		this.decorateCompanyId = decorateCompanyId;
	}

	public String getDecorateCompanyId() {
		return decorateCompanyId;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhoto() {
		return photo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setWorkingYears(Integer workingYears) {
		this.workingYears = workingYears;
	}

	public Integer getWorkingYears() {
		return workingYears;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getQq() {
		return qq;
	}

	public void setWeinxin(String weinxin) {
		this.weinxin = weinxin;
	}

	public String getWeinxin() {
		return weinxin;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfileText(String profileText) {
		this.profileText = profileText;
	}

	public String getProfileText() {
		return profileText;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setMoblieNubmer(String moblieNubmer) {
		this.moblieNubmer = moblieNubmer;
	}

	public String getMoblieNubmer() {
		return moblieNubmer;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getIsDelete() {
		return isDelete;
	}
}
