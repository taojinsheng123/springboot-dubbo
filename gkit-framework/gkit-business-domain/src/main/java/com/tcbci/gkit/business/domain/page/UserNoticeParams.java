package com.tcbci.gkit.business.domain.page;

import com.tcbci.gkit.business.page.PageParams;

/**
 * UserNotice分页查询
 * 
 * @author xukangjing
 *
 */
public class UserNoticeParams extends PageParams {

	private Integer toUser;// 发送至
	private String toUserEnterprise;// '标识 0.前台 1.后台'
	private Integer toUserScope;// 标识 0.前台 1.后台
	private Integer fromUser;// 发送人 0 表示系统
	private String tag;// 标签
	private Integer hasRead;// 是否已读 1.是

	public Integer getToUser() {
		return toUser;
	}

	public void setToUser(Integer toUser) {
		this.toUser = toUser;
	}

	public String getToUserEnterprise() {
		return toUserEnterprise;
	}

	public void setToUserEnterprise(String toUserEnterprise) {
		this.toUserEnterprise = toUserEnterprise;
	}

	public Integer getToUserScope() {
		return toUserScope;
	}

	public void setToUserScope(Integer toUserScope) {
		this.toUserScope = toUserScope;
	}

	public Integer getFromUser() {
		return fromUser;
	}

	public void setFromUser(Integer fromUser) {
		this.fromUser = fromUser;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getHasRead() {
		return hasRead;
	}

	public void setHasRead(Integer hasRead) {
		this.hasRead = hasRead;
	}

}
