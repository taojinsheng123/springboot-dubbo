package com.tcbci.gkit.business.domain.notice;

import java.util.Date;

/**
 * T_gb_user_notice 实体类 Fri Nov 18 10:22:53 CST 2016 xukangjing
 */

public class UserNotice {
	private Integer id;// 主键
	private String tag;// 标签
	private String tagName;// 标签名称
	private Integer fromUser;// 发送人 0 表示系统
	private String fromUserName;// 发送人，如果为系统发送，则为定值 admin
	private String title;// 信息标题
	private String content;// 信息内容
	private Integer toUser;// 发送至
	private String toUserEnterprise;// '标识 0.前台 1.后台'
	private Integer toUserScope;// 标识 0.前台 1.后台
	private String toUserName;// 收信人的账号
	private Integer hasRead;// 是否已读 1.是
	private Date readDate;// 阅读时间
	private Date createDate;// 创建时间

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagName() {
		return tagName;
	}

	public void setFromUser(Integer fromUser) {
		this.fromUser = fromUser;
	}

	public Integer getFromUser() {
		return fromUser;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setToUser(Integer toUser) {
		this.toUser = toUser;
	}

	public Integer getToUser() {
		return toUser;
	}

	public String getToUserEnterprise() {
		return toUserEnterprise;
	}

	public void setToUserEnterprise(String toUserEnterprise) {
		this.toUserEnterprise = toUserEnterprise;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getToUserName() {
		return toUserName;
	}

	public Integer getToUserScope() {
		return toUserScope;
	}

	public void setToUserScope(Integer toUserScope) {
		this.toUserScope = toUserScope;
	}

	public void setHasRead(Integer hasRead) {
		this.hasRead = hasRead;
	}

	public Integer getHasRead() {
		return hasRead;
	}

	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}

	public Date getReadDate() {
		return readDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
}
