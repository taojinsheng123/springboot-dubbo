package com.tcbci.gkit.business.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * 
 * @author dongfang
 *
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = -1032655538569258982L;

	private Integer id;

	private String userName;
	
	private String userPass;

	private String userEmail;

	private String userTrueName;

	private String userTel;

	private String userMobile;

	private String userTitle;

	private String nickName;

	private String UserPhoto1;

	private String UserPhoto2;

	private String UserPhoto3;

	private Integer custRef_Id;

	private Integer IsInner;

	private String UserDuty;

	private String WorkAttr;

	private String ManagementScope;

	private String BusinessLicense;

	private String CompanyName;

	private String CompanyAddress;

	private String Co_Xingzhi;

	private Integer CoProvince;

	private String CoProvinceName;

	private Integer CoCity;

	private String CoCityName;

	private Integer IsPay;

	private String idenNo;// 识别码

	private String recIdenNo;// 推荐人识别码

	private Integer newPlat;// 注册平台 0，内网开通 1，外网注册或外网创建的子账号  2，二维码推荐注册，3.pc着陆页 4.微信版

	private Date createDate;
	
	private Date endDate;//结束时间
	
	private Integer inuse;//是否禁用
	
	private Integer states;//状态
	
	private Integer loginLogId;//登录id
	
	public Integer getStates() {
		return states;
	}

	public void setStates(Integer states) {
		this.states = states;
	}

	public Integer getInuse() {
		return inuse;
	}

	public void setInuse(Integer inuse) {
		this.inuse = inuse;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public String getRecIdenNo() {
		return recIdenNo;
	}

	public void setRecIdenNo(String recIdenNo) {
		this.recIdenNo = recIdenNo;
	}

	public Integer getNewPlat() {
		return newPlat;
	}

	public void setNewPlat(Integer newPlat) {
		this.newPlat = newPlat;
	}

	public String getUserDuty() {
		return UserDuty;
	}

	public void setUserDuty(String userDuty) {
		UserDuty = userDuty;
	}

	public String getWorkAttr() {
		return WorkAttr;
	}

	public void setWorkAttr(String workAttr) {
		WorkAttr = workAttr;
	}

	public String getManagementScope() {
		return ManagementScope;
	}

	public void setManagementScope(String managementScope) {
		ManagementScope = managementScope;
	}

	public String getBusinessLicense() {
		return BusinessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		BusinessLicense = businessLicense;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getCompanyAddress() {
		return CompanyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}

	public String getCo_Xingzhi() {
		return Co_Xingzhi;
	}

	public void setCo_Xingzhi(String co_Xingzhi) {
		Co_Xingzhi = co_Xingzhi;
	}

	public Integer getCoProvince() {
		return CoProvince;
	}

	public void setCoProvince(Integer coProvince) {
		CoProvince = coProvince;
	}

	public String getCoProvinceName() {
		return CoProvinceName;
	}

	public void setCoProvinceName(String coProvinceName) {
		CoProvinceName = coProvinceName;
	}

	public Integer getCoCity() {
		return CoCity;
	}

	public void setCoCity(Integer coCity) {
		CoCity = coCity;
	}

	public String getCoCityName() {
		return CoCityName;
	}

	public void setCoCityName(String coCityName) {
		CoCityName = coCityName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserTrueName() {
		return userTrueName;
	}

	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserPhoto1() {
		return UserPhoto1;
	}

	public void setUserPhoto1(String userPhoto1) {
		UserPhoto1 = userPhoto1;
	}

	public String getUserPhoto2() {
		return UserPhoto2;
	}

	public void setUserPhoto2(String userPhoto2) {
		UserPhoto2 = userPhoto2;
	}

	public String getUserPhoto3() {
		return UserPhoto3;
	}

	public void setUserPhoto3(String userPhoto3) {
		UserPhoto3 = userPhoto3;
	}

	public String getInDisplayName() {
		if (this.userTrueName != null && !this.userTrueName.equals("")) {
			return this.userName;
		}
		if (this.nickName != null && !this.nickName.equals("")) {
			return this.nickName;
		}
		return this.userName;
	}

	public String getOutDisplayName() {
		if (this.nickName != null && !this.nickName.equals("")) {
			return this.nickName;
		}
		return this.userName;
	}

	public Integer getCustRef_Id() {
		return custRef_Id;
	}

	public void setCustRef_Id(Integer custRef_Id) {
		this.custRef_Id = custRef_Id;
	}

	public Integer getIsInner() {
		return IsInner;
	}

	public void setIsInner(Integer isInner) {
		IsInner = isInner;
	}

	public Integer getIsPay() {
		return this.IsPay;
	}

	public void setIsPay(Integer isPay) {
		this.IsPay = isPay;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	public Integer getLoginLogId() {
		return loginLogId;
	}

	public void setLoginLogId(Integer loginLogId) {
		this.loginLogId = loginLogId;
	}
	
	
}
