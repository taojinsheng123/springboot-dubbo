package com.tcbci.gkit.business.domain.notice;

/**
 * T_gb_statistical 实体类
 * 
 * @author chun
 *
 */
public class Statistical {
	private Integer id;// 主键
	private String targetId;// 目标的id
	private String targetType;// 浏览对象的分类 一般指表名
	private Integer type;// 0:收藏量 ; 1:浏览量
	private Integer total;// 总数量

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
