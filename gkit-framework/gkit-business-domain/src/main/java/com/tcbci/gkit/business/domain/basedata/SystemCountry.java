package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_system_country 实体类 Tue Nov 15 10:33:19 CST 2016 yuhuaqiu
 */

public class SystemCountry {
	private Integer id;// 主键
	private String name;// 国家名称
	private String nameEn;// 国家名称(英)
	private String code;// 国家代码 如: 86
	private Integer enable;// 1.启用
	private Integer creator;// 创建人
	private Date createDate;// 创建时间
	private Integer editor;// 更新人
	private Date editDate;// 更新日期

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
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
