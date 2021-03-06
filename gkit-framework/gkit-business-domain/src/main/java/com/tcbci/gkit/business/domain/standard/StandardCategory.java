package com.tcbci.gkit.business.domain.standard;

import java.io.Serializable;
import java.util.Date;

/**
 * 标准规范
 * 
 * @author dongfang
 *
 */
public class StandardCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer standardSortID;

	private String name;

	private Integer parentId;

	private Integer isDel;

	private Integer createrID;

	private Date createTime;

	private Integer modifierID;

	private Date modifyTime;

	public Integer getStandardSortID() {
		return standardSortID;
	}

	public void setStandardSortID(Integer standardSortID) {
		this.standardSortID = standardSortID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getCreaterID() {
		return createrID;
	}

	public void setCreaterID(Integer createrID) {
		this.createrID = createrID;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getModifierID() {
		return modifierID;
	}

	public void setModifierID(Integer modifierID) {
		this.modifierID = modifierID;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
