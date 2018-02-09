package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_system_country_province 实体类 Tue Nov 15 16:01:51 CST 2016 yuhuaqiu
 */

public class SystemProvince {
	private Integer id;// 主键
	private Integer countryId;// 国家id
	private Integer areaId;// 区域id
	private String areaName;// 区域名称
	private String name;// 名称
	private String nameEn;// 名称(英)
	private String code;// 编码:国家行政区域编码
	private String parentCode;// 父级id
	private String areaCode;// 区号
	private String postCode;// 邮编
	private Integer postId;// 查询邮编用
	private String level;// 城市等级 如:特、一、二、三、四
	private String civilStandard;// 土建标准
	private Integer enable;// 是否启用 1.是
	private Integer creator;// 创建人
	private Date createDate;// 创建时间
	private Integer editor;// 更新人
	private Date editDate;// 更新时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setCivilStandard(String civilStandard) {
		this.civilStandard = civilStandard;
	}

	public String getCivilStandard() {
		return civilStandard;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setEditor(Integer editor) {
		this.editor = editor;
	}

	public Integer getEditor() {
		return editor;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Date getEditDate() {
		return editDate;
	}
}
