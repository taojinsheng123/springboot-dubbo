package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_service_qualification 实体类 Thu Nov 10 15:40:43 CST 2016 yuhuaqiu
 */

public class ServiceQualification {
	private Integer id;// 自增
	private String name;// 资质名称
	private Integer parentId;// 父级id
	private String path;// 路径 如1.2.
	private Date createDate;// 创建时间

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

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
