package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

/**
 * OperateLog分页查询类
 * 
 * @author xukangjing
 *
 */
public class OperateLogParams extends PageParams {

	private String targetType;// 目标，一般指表名
	private String group;// 分组,默认为default
	private Integer targetUser;// 目标所属的用户（一般指创建人）

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Integer getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(Integer targetUser) {
		this.targetUser = targetUser;
	}

}
