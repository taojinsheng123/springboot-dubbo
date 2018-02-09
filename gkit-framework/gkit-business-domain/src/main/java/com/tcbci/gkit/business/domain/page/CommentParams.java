package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

/**
 * 评论参数
 * 
 * @author dongfang
 *
 */
public class CommentParams extends PageParams {
	/**
	 * 目标id
	 */
	private String targetId;

	/**
	 * 目标类型，1产品
	 */
	private Integer targetType;

	/**
	 * 引用路径
	 */
	private Integer refId;

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public Integer getTargetType() {
		return targetType;
	}

	public void setTargetType(Integer targetType) {
		this.targetType = targetType;
	}

	public Integer getRefId() {
		return refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}
}
