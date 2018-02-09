package com.tcbci.gkit.business.domain.standard;

import java.util.Date;

public class Standard {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.StandardID
	 * 
	 * @mbg.generated
	 */
	private Integer standardID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.StandardTitle
	 * 
	 * @mbg.generated
	 */
	private String standardTitle;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.StandardTitleSpell
	 * 
	 * @mbg.generated
	 */
	private String standardTitleSpell;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.NumId
	 * 
	 * @mbg.generated
	 */
	private String numId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Promulgate_Organ
	 * 
	 * @mbg.generated
	 */
	private String promulgate_Organ;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Confirm_Organ
	 * 
	 * @mbg.generated
	 */
	private String confirm_Organ;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Promulgate_Size
	 * 
	 * @mbg.generated
	 */
	private String promulgate_Size;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Promulgate_Date
	 * 
	 * @mbg.generated
	 */
	private Date promulgate_Date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Executive_Date
	 * 
	 * @mbg.generated
	 */
	private Date executive_Date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Promulgate_OrganAttribute_Id
	 * 
	 * @mbg.generated
	 */
	private Integer promulgate_OrganAttribute_Id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Invalidation
	 * 
	 * @mbg.generated
	 */
	private String invalidation;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.StandardLevel_ID
	 * 
	 * @mbg.generated
	 */
	private Integer standardLevel_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.StandardSort_ID
	 * 
	 * @mbg.generated
	 */
	private String standardSort_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Memo
	 * 
	 * @mbg.generated
	 */
	private String memo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.StandardProvince_Id
	 * 
	 * @mbg.generated
	 */
	private Integer standardProvince_Id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Order_Units
	 * 
	 * @mbg.generated
	 */
	private String order_Units;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.IsDel
	 * 
	 * @mbg.generated
	 */
	private Byte isDel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.CreaterID
	 * 
	 * @mbg.generated
	 */
	private Integer createrID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.CreateTime
	 * 
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.ModifierID
	 * 
	 * @mbg.generated
	 */
	private Integer modifierID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.ModifyTime
	 * 
	 * @mbg.generated
	 */
	private Date modifyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.clickCount
	 * 
	 * @mbg.generated
	 */
	private Integer clickCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.IsCheck
	 * 
	 * @mbg.generated
	 */
	private Integer isCheck;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.AuditorID
	 * 
	 * @mbg.generated
	 */
	private Integer auditorID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.AuditeTime
	 * 
	 * @mbg.generated
	 */
	private Date auditeTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column dbo.Standard.Content
	 * 
	 * @mbg.generated
	 */
	private String content;

	/**
	 * 效力级别
	 */
	private String standardLevelName;

	/**
	 * 时效性
	 */
	private String invalidationName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.StandardID
	 * 
	 * @return the value of dbo.Standard.StandardID
	 * @mbg.generated
	 */
	public Integer getStandardID() {
		return standardID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.StandardID
	 * 
	 * @param standardID
	 *            the value for dbo.Standard.StandardID
	 * @mbg.generated
	 */
	public void setStandardID(Integer standardID) {
		this.standardID = standardID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.StandardTitle
	 * 
	 * @return the value of dbo.Standard.StandardTitle
	 * @mbg.generated
	 */
	public String getStandardTitle() {
		return standardTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.StandardTitle
	 * 
	 * @param standardTitle
	 *            the value for dbo.Standard.StandardTitle
	 * @mbg.generated
	 */
	public void setStandardTitle(String standardTitle) {
		this.standardTitle = standardTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.StandardTitleSpell
	 * 
	 * @return the value of dbo.Standard.StandardTitleSpell
	 * @mbg.generated
	 */
	public String getStandardTitleSpell() {
		return standardTitleSpell;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.StandardTitleSpell
	 * 
	 * @param standardTitleSpell
	 *            the value for dbo.Standard.StandardTitleSpell
	 * @mbg.generated
	 */
	public void setStandardTitleSpell(String standardTitleSpell) {
		this.standardTitleSpell = standardTitleSpell;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.NumId
	 * 
	 * @return the value of dbo.Standard.NumId
	 * @mbg.generated
	 */
	public String getNumId() {
		return numId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.NumId
	 * 
	 * @param numId
	 *            the value for dbo.Standard.NumId
	 * @mbg.generated
	 */
	public void setNumId(String numId) {
		this.numId = numId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Promulgate_Organ
	 * 
	 * @return the value of dbo.Standard.Promulgate_Organ
	 * @mbg.generated
	 */
	public String getPromulgate_Organ() {
		return promulgate_Organ;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Promulgate_Organ
	 * 
	 * @param promulgate_Organ
	 *            the value for dbo.Standard.Promulgate_Organ
	 * @mbg.generated
	 */
	public void setPromulgate_Organ(String promulgate_Organ) {
		this.promulgate_Organ = promulgate_Organ;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Confirm_Organ
	 * 
	 * @return the value of dbo.Standard.Confirm_Organ
	 * @mbg.generated
	 */
	public String getConfirm_Organ() {
		return confirm_Organ;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Confirm_Organ
	 * 
	 * @param confirm_Organ
	 *            the value for dbo.Standard.Confirm_Organ
	 * @mbg.generated
	 */
	public void setConfirm_Organ(String confirm_Organ) {
		this.confirm_Organ = confirm_Organ;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Promulgate_Size
	 * 
	 * @return the value of dbo.Standard.Promulgate_Size
	 * @mbg.generated
	 */
	public String getPromulgate_Size() {
		return promulgate_Size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Promulgate_Size
	 * 
	 * @param promulgate_Size
	 *            the value for dbo.Standard.Promulgate_Size
	 * @mbg.generated
	 */
	public void setPromulgate_Size(String promulgate_Size) {
		this.promulgate_Size = promulgate_Size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Promulgate_Date
	 * 
	 * @return the value of dbo.Standard.Promulgate_Date
	 * @mbg.generated
	 */
	public Date getPromulgate_Date() {
		return promulgate_Date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Promulgate_Date
	 * 
	 * @param promulgate_Date
	 *            the value for dbo.Standard.Promulgate_Date
	 * @mbg.generated
	 */
	public void setPromulgate_Date(Date promulgate_Date) {
		this.promulgate_Date = promulgate_Date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Executive_Date
	 * 
	 * @return the value of dbo.Standard.Executive_Date
	 * @mbg.generated
	 */
	public Date getExecutive_Date() {
		return executive_Date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Executive_Date
	 * 
	 * @param executive_Date
	 *            the value for dbo.Standard.Executive_Date
	 * @mbg.generated
	 */
	public void setExecutive_Date(Date executive_Date) {
		this.executive_Date = executive_Date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Promulgate_OrganAttribute_Id
	 * 
	 * @return the value of dbo.Standard.Promulgate_OrganAttribute_Id
	 * @mbg.generated
	 */
	public Integer getPromulgate_OrganAttribute_Id() {
		return promulgate_OrganAttribute_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Promulgate_OrganAttribute_Id
	 * 
	 * @param promulgate_OrganAttribute_Id
	 *            the value for dbo.Standard.Promulgate_OrganAttribute_Id
	 * @mbg.generated
	 */
	public void setPromulgate_OrganAttribute_Id(Integer promulgate_OrganAttribute_Id) {
		this.promulgate_OrganAttribute_Id = promulgate_OrganAttribute_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Invalidation
	 * 
	 * @return the value of dbo.Standard.Invalidation
	 * @mbg.generated
	 */
	public String getInvalidation() {
		return invalidation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Invalidation
	 * 
	 * @param invalidation
	 *            the value for dbo.Standard.Invalidation
	 * @mbg.generated
	 */
	public void setInvalidation(String invalidation) {
		this.invalidation = invalidation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.StandardLevel_ID
	 * 
	 * @return the value of dbo.Standard.StandardLevel_ID
	 * @mbg.generated
	 */
	public Integer getStandardLevel_ID() {
		return standardLevel_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.StandardLevel_ID
	 * 
	 * @param standardLevel_ID
	 *            the value for dbo.Standard.StandardLevel_ID
	 * @mbg.generated
	 */
	public void setStandardLevel_ID(Integer standardLevel_ID) {
		this.standardLevel_ID = standardLevel_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.StandardSort_ID
	 * 
	 * @return the value of dbo.Standard.StandardSort_ID
	 * @mbg.generated
	 */
	public String getStandardSort_ID() {
		return standardSort_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.StandardSort_ID
	 * 
	 * @param standardSort_ID
	 *            the value for dbo.Standard.StandardSort_ID
	 * @mbg.generated
	 */
	public void setStandardSort_ID(String standardSort_ID) {
		this.standardSort_ID = standardSort_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Memo
	 * 
	 * @return the value of dbo.Standard.Memo
	 * @mbg.generated
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Memo
	 * 
	 * @param memo
	 *            the value for dbo.Standard.Memo
	 * @mbg.generated
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.StandardProvince_Id
	 * 
	 * @return the value of dbo.Standard.StandardProvince_Id
	 * @mbg.generated
	 */
	public Integer getStandardProvince_Id() {
		return standardProvince_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.StandardProvince_Id
	 * 
	 * @param standardProvince_Id
	 *            the value for dbo.Standard.StandardProvince_Id
	 * @mbg.generated
	 */
	public void setStandardProvince_Id(Integer standardProvince_Id) {
		this.standardProvince_Id = standardProvince_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Order_Units
	 * 
	 * @return the value of dbo.Standard.Order_Units
	 * @mbg.generated
	 */
	public String getOrder_Units() {
		return order_Units;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Order_Units
	 * 
	 * @param order_Units
	 *            the value for dbo.Standard.Order_Units
	 * @mbg.generated
	 */
	public void setOrder_Units(String order_Units) {
		this.order_Units = order_Units;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.IsDel
	 * 
	 * @return the value of dbo.Standard.IsDel
	 * @mbg.generated
	 */
	public Byte getIsDel() {
		return isDel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.IsDel
	 * 
	 * @param isDel
	 *            the value for dbo.Standard.IsDel
	 * @mbg.generated
	 */
	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.CreaterID
	 * 
	 * @return the value of dbo.Standard.CreaterID
	 * @mbg.generated
	 */
	public Integer getCreaterID() {
		return createrID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.CreaterID
	 * 
	 * @param createrID
	 *            the value for dbo.Standard.CreaterID
	 * @mbg.generated
	 */
	public void setCreaterID(Integer createrID) {
		this.createrID = createrID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.CreateTime
	 * 
	 * @return the value of dbo.Standard.CreateTime
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.CreateTime
	 * 
	 * @param createTime
	 *            the value for dbo.Standard.CreateTime
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.ModifierID
	 * 
	 * @return the value of dbo.Standard.ModifierID
	 * @mbg.generated
	 */
	public Integer getModifierID() {
		return modifierID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.ModifierID
	 * 
	 * @param modifierID
	 *            the value for dbo.Standard.ModifierID
	 * @mbg.generated
	 */
	public void setModifierID(Integer modifierID) {
		this.modifierID = modifierID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.ModifyTime
	 * 
	 * @return the value of dbo.Standard.ModifyTime
	 * @mbg.generated
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.ModifyTime
	 * 
	 * @param modifyTime
	 *            the value for dbo.Standard.ModifyTime
	 * @mbg.generated
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.clickCount
	 * 
	 * @return the value of dbo.Standard.clickCount
	 * @mbg.generated
	 */
	public Integer getClickCount() {
		return clickCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.clickCount
	 * 
	 * @param clickCount
	 *            the value for dbo.Standard.clickCount
	 * @mbg.generated
	 */
	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.IsCheck
	 * 
	 * @return the value of dbo.Standard.IsCheck
	 * @mbg.generated
	 */
	public Integer getIsCheck() {
		return isCheck;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.IsCheck
	 * 
	 * @param isCheck
	 *            the value for dbo.Standard.IsCheck
	 * @mbg.generated
	 */
	public void setIsCheck(Integer isCheck) {
		this.isCheck = isCheck;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.AuditorID
	 * 
	 * @return the value of dbo.Standard.AuditorID
	 * @mbg.generated
	 */
	public Integer getAuditorID() {
		return auditorID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.AuditorID
	 * 
	 * @param auditorID
	 *            the value for dbo.Standard.AuditorID
	 * @mbg.generated
	 */
	public void setAuditorID(Integer auditorID) {
		this.auditorID = auditorID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.AuditeTime
	 * 
	 * @return the value of dbo.Standard.AuditeTime
	 * @mbg.generated
	 */
	public Date getAuditeTime() {
		return auditeTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.AuditeTime
	 * 
	 * @param auditeTime
	 *            the value for dbo.Standard.AuditeTime
	 * @mbg.generated
	 */
	public void setAuditeTime(Date auditeTime) {
		this.auditeTime = auditeTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column dbo.Standard.Content
	 * 
	 * @return the value of dbo.Standard.Content
	 * @mbg.generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column dbo.Standard.Content
	 * 
	 * @param content
	 *            the value for dbo.Standard.Content
	 * @mbg.generated
	 */
	public void setContent(String content) {
		this.content = content;
	}

	public String getStandardLevelName() {
		return standardLevelName;
	}

	public void setStandardLevelName(String standardLevelName) {
		this.standardLevelName = standardLevelName;
	}

	public String getInvalidationName() {
		return invalidationName;
	}

	public void setInvalidationName(String invalidationName) {
		this.invalidationName = invalidationName;
	}
}