package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_project_category 实体类 Tue Nov 15 15:41:55 CST 2016 yuhuaqiu
 */

public class ProjectCategory {
	private Integer id;// 自增
	private String code;// 编码
	private String name;// 名称
	private String nameEn;// 名称英
	private Integer parentId;// 父级id
	private String path;// 路径
	private Integer enable;// 是否启用 1.是 0.否
	private Integer seq;// 排序
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer editUser;// 编辑人
	private Date editDate;// 更新时间
	private String parentCode;
	private String parentName;
	private String parentNameEn;
	private Integer parentSeq;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
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

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getSeq() {
		return seq;
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

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentNameEn() {
		return parentNameEn;
	}

	public void setParentNameEn(String parentNameEn) {
		this.parentNameEn = parentNameEn;
	}

	public Integer getParentSeq() {
		return parentSeq;
	}

	public void setParentSeq(Integer parentSeq) {
		this.parentSeq = parentSeq;
	}
}
