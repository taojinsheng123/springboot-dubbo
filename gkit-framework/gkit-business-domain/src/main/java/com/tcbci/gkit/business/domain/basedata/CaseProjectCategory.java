package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_case_project_category 实体类 Mon Nov 14 14:46:23 CST 2016 yuhuaqiu
 */

public class CaseProjectCategory {
	private Integer id;// 自增
	private String caseId;// 案例id
	private Integer flag;// 0.编辑版本 1.只读版本
	private String category;// 分类
	private String categoryName;// 分类名称
	private String categoryPath;// 分类路径
	private Date createDate;// 创建时间

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

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getCategoryPath() {
		return categoryPath;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
