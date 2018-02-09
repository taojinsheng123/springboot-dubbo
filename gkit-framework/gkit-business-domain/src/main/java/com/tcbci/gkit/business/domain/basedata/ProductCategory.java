package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_product_category 实体类 Tue Nov 15 11:02:57 CST 2016 yuhuaqiu
 */

public class ProductCategory {
	private Integer id;// 自增
	private String code;// 编码
	private String name;// 名称
	private String nameEn;// 名称英
	private String nameExt;// 扩展名如上级名称->本级名称
	private String nameExtEn;// 扩展名称英
	private String remark;// 备注
	private Integer parentId;// 父级id
	private String path;// 路径
	private Integer enable;// 是否启用 1.是 0.否
	private Integer seq;// 排序
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer editUser;// 编辑人
	private Date editDate;// 更新时间

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

	public void setNameExt(String nameExt) {
		this.nameExt = nameExt;
	}

	public String getNameExt() {
		return nameExt;
	}

	public void setNameExtEn(String nameExtEn) {
		this.nameExtEn = nameExtEn;
	}

	public String getNameExtEn() {
		return nameExtEn;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
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

	/**
	 * 如果对象类型是ProductCategory 的话 则返回true 去比较hashCode值
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof ProductCategory) {
			ProductCategory p = (ProductCategory) obj;
			if (p.id.equals(this.id)) {
				// 比较id一致时返回true 之后再去比较 hashCode
				return true;
			}
		}
		return false;
	}

	/**
	 * 重写hashcode 方法，返回的hashCode 不一样才认定为不同的对象
	 */
	@Override
	public int hashCode() {
		return id.hashCode();// 只比较id，id一样就不添加进集合
	}
}
