package com.tcbci.gkit.business.domain.search;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * V_gb_case 实体类 Fri Dec 02 17:40:05 CST 2016 xukangjing
 */

public class VCase extends VBase {
	private Integer id;// 自增
	private String caseId;// 案例id
	private String enterpriseId;//
	private String enterpriseShortName;// 简称
	private String enterpriseFullName;// 公司全名
	private String projectName;// 项目名称
	private String firstParty;// 甲方
	private double contractTotal;// 合同总额
	private String countryCode;//
	private String countryName;// 国家名称
	private String provinceCode;// 省
	private String provinceName;// 省名称
	private String cityCode;// 市
	private String cityName;// 城市
	private String address;// 地址
	private String description;// 项目描述
	private String descriptionText;// 项目描述(纯文本)
	private String images;// 项目图片，多个 用坚线分隔
	private String contractSimple;// 合同图片，多个用竖线分隔
	private String category;// 项目类型
	private Date createDate;// 创建时间

	// 项目简介
	public String getSummary() {
		try {
			String regEx_html = "<[^>]+>";
			Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
			if (descriptionText == null) {
				descriptionText = "";
			}
			Matcher m_html = p_html.matcher(descriptionText);
			String htmlStr = m_html.replaceAll("");
			htmlStr = htmlStr.replaceAll("&nbsp;", "");
			if (htmlStr.length() < 180) {
				return htmlStr;
			}
			return htmlStr.substring(0, 180) + "...";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseShortName(String enterpriseShortName) {
		this.enterpriseShortName = enterpriseShortName;
	}

	public String getEnterpriseShortName() {
		return enterpriseShortName;
	}

	public void setEnterpriseFullName(String enterpriseFullName) {
		this.enterpriseFullName = enterpriseFullName;
	}

	public String getEnterpriseFullName() {
		return enterpriseFullName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setFirstParty(String firstParty) {
		this.firstParty = firstParty;
	}

	public String getFirstParty() {
		return firstParty;
	}

	public void setContractTotal(double contractTotal) {
		this.contractTotal = contractTotal;
	}

	public double getContractTotal() {
		return contractTotal;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
	}

	public String getDescriptionText() {
		return descriptionText;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getImages() {
		return images;
	}

	public void setContractSimple(String contractSimple) {
		this.contractSimple = contractSimple;
	}

	public String getContractSimple() {
		return contractSimple;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFirstImage() {
		if (this.images == null || this.images.length() == 0) {
			return null;
		}
		String[] array = this.images.split("\\|");
		return array.length != 0 ? array[0] : null;
	}
}
