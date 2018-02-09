package com.tcbci.gkit.business.domain.market;

import java.util.Date;
import java.util.List;

import com.tcbci.gkit.business.domain.basedata.Brand;

/**
 * T_gb_market_category 实体类 Tue Sep 19 09:49:19 CST 2017 heqichun
 */

public class MarketCategory {
	private Integer id;//自增
	private String code;//编码
	private String name;//名称
	private String path;//路径
	private Integer enable;//是否启用 1.是 0.否
	private Integer seq;//排序
	private Integer createUser;//创建人
	private Date createDate;//创建时间
	private Integer editUser;//编辑人
	private Date editDate;//更新时间
	private String logo;//图片路径
	private List<Brand> brandList;
	
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Brand> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<Brand> brandList) {
		this.brandList = brandList;
	}

	public List<Brand> getList() {
		return brandList;
	}

	public void setList(List<Brand> list) {
		this.brandList = list;
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
