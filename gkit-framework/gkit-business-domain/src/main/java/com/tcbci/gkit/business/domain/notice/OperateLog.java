package com.tcbci.gkit.business.domain.notice;

import java.util.Date;

/**
 * T_gb_operate_log 实体类 Fri Nov 18 10:22:01 CST 2016 xukangjing
 */

public class OperateLog {
	private Integer id;// 自增
	private String targetId;// 日志目标id
	private String targetType;// 目标，一般指表名
	private Integer targetUser;// 目标所属的用户（一般指创建人）
	private String group;// 分组,默认为default
	private String title;// 标题
	private Integer state;// 状态
	private String stateName;// 状态名称
	private String remark;// 备注说明
	private Integer level;// 0.内外网用户可见 1.内外用户可见
	private String userName;// 添加人
	private Date createDate;// 创建时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetUser(Integer targetUser) {
		this.targetUser = targetUser;
	}

	public Integer getTargetUser() {
		return targetUser;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getState() {
		return state;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getLevel() {
		return level;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
