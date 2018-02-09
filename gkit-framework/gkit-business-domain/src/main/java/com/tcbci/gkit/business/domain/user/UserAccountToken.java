package com.tcbci.gkit.business.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户token信息
 * 
 * @author dongfang
 *
 */
public class UserAccountToken implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer userId;

	private Date createDate;

	private Date expirsDate;

	private Integer status;

	private String token;

	private Integer terminal;

	private Date logoutDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getExpirsDate() {
		return expirsDate;
	}

	public void setExpirsDate(Date expirsDate) {
		this.expirsDate = expirsDate;
	}

	/**
	 * 获取当前的token状态
	 * 
	 * @return 1.正常 2.用户退出 3.用户强制退出 4.已过期
	 */
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * 获取当前token登录的用户终端
	 * 
	 * @return 终端 1.Web 2.Mobile 3.MoblieWeb 4.Desktop
	 */
	public Integer getTeminal() {
		return terminal;
	}

	public void setTeminal(Integer terminal) {
		this.terminal = terminal;
	}

	public Date getLogoutDate() {
		return logoutDate;
	}

	public void setLogoutDate(Date logoutDate) {
		this.logoutDate = logoutDate;
	}
}
