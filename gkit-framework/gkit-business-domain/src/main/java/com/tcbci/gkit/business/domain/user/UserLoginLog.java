package com.tcbci.gkit.business.domain.user;

import java.io.Serializable;
import java.util.Date;

public class UserLoginLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer UserLoginID;

	private Integer UserId;
	private String  UserName;
	private Integer UserCompanyId;
	private Date   UserLoginDate;
	private String UserLoginOS;
	private String UserLoginIE;
	private String UserLoginIP;
	private String UserCookieUserName;
	private String UserCookieCompany;
	private String UserOldCookie;
	private String userLastCookie;
	private Integer userTry;
	private String userTryPass;
	private String userTryWhy;
	public Integer getUserLoginID() {
		return UserLoginID;
	}
	public void setUserLoginID(Integer userLoginID) {
		UserLoginID = userLoginID;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Integer getUserCompanyId() {
		return UserCompanyId;
	}
	public void setUserCompanyId(Integer userCompanyId) {
		UserCompanyId = userCompanyId;
	}
	public Date getUserLoginDate() {
		return UserLoginDate;
	}
	public void setUserLoginDate(Date userLoginDate) {
		UserLoginDate = userLoginDate;
	}
	public String getUserLoginOS() {
		return UserLoginOS;
	}
	public void setUserLoginOS(String userLoginOS) {
		UserLoginOS = userLoginOS;
	}
	public String getUserLoginIE() {
		return UserLoginIE;
	}
	public void setUserLoginIE(String userLoginIE) {
		UserLoginIE = userLoginIE;
	}
	public String getUserLoginIP() {
		return UserLoginIP;
	}
	public void setUserLoginIP(String userLoginIP) {
		UserLoginIP = userLoginIP;
	}
	public String getUserCookieUserName() {
		return UserCookieUserName;
	}
	public void setUserCookieUserName(String userCookieUserName) {
		UserCookieUserName = userCookieUserName;
	}
	public String getUserCookieCompany() {
		return UserCookieCompany;
	}
	public void setUserCookieCompany(String userCookieCompany) {
		UserCookieCompany = userCookieCompany;
	}
	public String getUserOldCookie() {
		return UserOldCookie;
	}
	public void setUserOldCookie(String userOldCookie) {
		UserOldCookie = userOldCookie;
	}
	public String getUserLastCookie() {
		return userLastCookie;
	}
	public void setUserLastCookie(String userLastCookie) {
		this.userLastCookie = userLastCookie;
	}
	public Integer getUserTry() {
		return userTry;
	}
	public void setUserTry(Integer userTry) {
		this.userTry = userTry;
	}
	public String getUserTryPass() {
		return userTryPass;
	}
	public void setUserTryPass(String userTryPass) {
		this.userTryPass = userTryPass;
	}
	public String getUserTryWhy() {
		return userTryWhy;
	}
	public void setUserTryWhy(String userTryWhy) {
		this.userTryWhy = userTryWhy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
