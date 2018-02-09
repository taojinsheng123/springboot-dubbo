package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_system_args 实体类 Thu Jan 05 10:41:13 CST 2017 xukangjing
 */

public class SystemArgs {
	private Integer id;// 自增
	private String argKey;// 参数键
	private String name;// 参数名称
	private String value;// 参数值
	private String remark;// 备注
	private String enable;// 是否启用 1.是
	private Integer parentId;// 父级id
	private Integer seq;// 排序
	private Integer clickCount;// 点击数
	private String path;// 路径
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer editUser;// 编辑人
	private Date editDate;// 编辑时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setArgKey(String argKey) {
		this.argKey = argKey;
	}

	public String getArgKey() {
		return argKey;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getEnable() {
		return enable;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getParentId() {
		return parentId;
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

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
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
}
