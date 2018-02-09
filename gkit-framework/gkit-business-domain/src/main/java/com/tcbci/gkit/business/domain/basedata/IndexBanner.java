package com.tcbci.gkit.business.domain.basedata;

import java.util.Date;

/**
 * T_gb_index_banner 实体类 Sat Dec 03 13:23:38 CST 2016 yuhuaqiu
 */

public class IndexBanner {
	private Integer id;// 自增
	private String picUri;// banner图地址
	private String link;// 跳转地址
	private String title;// banner的标题
	private Integer type;// 分类 1 - 19.首页banner
	private String description;// 简要描述
	private Integer enable;// 是否启用 1.是
	private Date createDate;// 创建时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setPicUri(String picUri) {
		this.picUri = picUri;
	}

	public String getPicUri() {
		return picUri;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

}
