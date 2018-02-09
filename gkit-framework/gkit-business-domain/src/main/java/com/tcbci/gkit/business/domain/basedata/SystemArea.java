package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_system_country_area 实体类 Tue Nov 15 09:32:12 CST 2016 yuhuaqiu
 */

public class SystemArea {
	private Integer id;// 主键
	private Integer countryId;// 国家id
	private String name;// 区域名称
	private String nameEn;// 区域名称英文
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
