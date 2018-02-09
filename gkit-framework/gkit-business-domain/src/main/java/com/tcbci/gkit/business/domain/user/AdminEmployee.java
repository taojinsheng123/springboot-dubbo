package com.tcbci.gkit.business.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * 
 * @author dongfang
 *
 */
public class AdminEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer emplId;

	private String emplLoginName;// 账号

	private String emplRealName;// 真实姓名

	private String emplPassword;// 密码

	private Integer deptId;// 部门id

	private String deptName; // 部门名称

	private String staus;// 状态 1.在职 99.离职

	private Integer roleId; // 角色id

	private String roleName;// 角色名称

	private Integer roleLevel;// 角色等级

	private Integer frontUserId;// 外网用户id

	private String frontUserName;// 外网账号

	private Integer companyId; // 分公司id

	private String branchOfficeName;// 分公司名称

	private String mobile;

	private String email;

	private String qq;

	private String tel;// 座机

	private String fax;// 传真

	private String seatLine;// 坐席号

	private Date joinDate;// 入职时间

	private Date leaveDate;// 离职时间

	private Integer creator;// 创建人

	private Date createDate;// 创建时间

	private Integer editor;// 修改人

	private Date editDate;// 修改时间

	public Integer getEmplId() {
		return emplId;
	}

	public void setEmplId(Integer emplId) {
		this.emplId = emplId;
	}

	public String getEmplLoginName() {
		return emplLoginName;
	}

	public void setEmplLoginName(String emplLoginName) {
		this.emplLoginName = emplLoginName;
	}

	public String getEmplRealName() {
		return emplRealName;
	}

	public void setEmplRealName(String emplRealName) {
		this.emplRealName = emplRealName;
	}

	public String getEmplPassword() {
		return emplPassword;
	}

	public void setEmplPassword(String emplPassword) {
		this.emplPassword = emplPassword;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getBranchOfficeName() {
		return branchOfficeName;
	}

	public void setBranchOfficeName(String branchOfficeName) {
		this.branchOfficeName = branchOfficeName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}

	public Integer getRoleLevel() {
		return roleLevel;
	}

	public void setRoleLevel(Integer roleLevel) {
		this.roleLevel = roleLevel;
	}

	public Integer getFrontUserId() {
		return frontUserId;
	}

	public void setFrontUserId(Integer frontUserId) {
		this.frontUserId = frontUserId;
	}

	public String getFrontUserName() {
		return frontUserName;
	}

	public void setFrontUserName(String frontUserName) {
		this.frontUserName = frontUserName;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getSeatLine() {
		return seatLine;
	}

	public void setSeatLine(String seatLine) {
		this.seatLine = seatLine;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Integer getEditor() {
		return editor;
	}

	public void setEditor(Integer editor) {
		this.editor = editor;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

}