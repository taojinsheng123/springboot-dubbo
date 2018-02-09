package com.tcbci.gkit.business.domain.search;

import java.util.List;

import com.tcbci.gkit.business.domain.enterprise.EnterpriseServiceArea;
import com.tcbci.gkit.business.domain.product.Product;

/**
 * V_gb_enterprise 实体类 Fri Dec 02 17:42:32 CST 2016 xukangjing
 */

public class VEnterprise extends VBase {
	private String userName;// 用户账号
	private String enterpriseId;// 企业id，此id为企业的真实id
	private String fullName;// 公司全名
	private String shortName;// 简称
	private String logo;// logo图片，绝对路径
	private String corporation;// 公司法人
	private String businessNature;// 业务性质
	private String businessNatureName;// 业务性质名称
	private String enterpriseNature;// 公司性质
	private String enterpriseNatureName;// 公司性质名称
	private double registeredCapital;// 注册资本(万元)
	private String registeredCapitalUnit;// 注册资本单位
	private Integer foundYear;// 成立年份
	private String majorBusiness;// 经营主营业务
	private String businessLicense;// 营业执照号
	private String supplierCategory;// 供应商类型
	private String supplierCategoryName;// 供应商类型名称
	private String introduction;// 公司介绍
	private String introductionText;// 公司介绍(纯文本)
	private String phonePrefix;// 电话前缀 86
	private String phoneCode;// 电话区号
	private String phoneNumber;// 电话号码
	private String phoneExt;// 分机号
	private String faxPrefix;// 传真前缀
	private String faxCode;// 传真区号
	private String faxNumber;// 传真号
	private String faxExt;// 分机号
	private String wexinMp;// 微信公众号
	private String website;// 网址
	private String email;// 企业邮箱
	private String countryCode;// 国家
	private String countryName;// 国家名称
	private String provinceCode;// 省
	private String provinceName;// 省名称
	private String cityCode;// 市
	private String cityName;// 市名称
	private String areaCode;// 县
	private String areaName;// 县名称
	private String address;// 地址
	private Integer productCount;//
	private Integer caseCount;//
	private List<Product> productList;// 产品列表
	private Integer seq;// 综合排序
	private String qq;// qq
	private String hotline;// 服务热线
	private List<EnterpriseServiceArea> serviceAreaList;// 服务区域

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getHotline() {
		return hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getCorporation() {
		return corporation;
	}

	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}

	public String getBusinessNature() {
		return businessNature;
	}

	public void setBusinessNatureName(String businessNatureName) {
		this.businessNatureName = businessNatureName;
	}

	public String getBusinessNatureName() {
		return businessNatureName;
	}

	public void setEnterpriseNature(String enterpriseNature) {
		this.enterpriseNature = enterpriseNature;
	}

	public String getEnterpriseNature() {
		return enterpriseNature;
	}

	public void setEnterpriseNatureName(String enterpriseNatureName) {
		this.enterpriseNatureName = enterpriseNatureName;
	}

	public String getEnterpriseNatureName() {
		return enterpriseNatureName;
	}

	public void setRegisteredCapital(double registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public double getRegisteredCapital() {
		return registeredCapital;
	}

	public String getRegisteredCapitalUnit() {
		return registeredCapitalUnit;
	}

	public void setRegisteredCapitalUnit(String registeredCapitalUnit) {
		this.registeredCapitalUnit = registeredCapitalUnit;
	}

	public void setFoundYear(Integer foundYear) {
		this.foundYear = foundYear;
	}

	public Integer getFoundYear() {
		return foundYear;
	}

	public void setMajorBusiness(String majorBusiness) {
		this.majorBusiness = majorBusiness;
	}

	public String getMajorBusiness() {
		return majorBusiness;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setSupplierCategory(String supplierCategory) {
		this.supplierCategory = supplierCategory;
	}

	public String getSupplierCategory() {
		return supplierCategory;
	}

	public void setSupplierCategoryName(String supplierCategoryName) {
		this.supplierCategoryName = supplierCategoryName;
	}

	public String getSupplierCategoryName() {
		return supplierCategoryName;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroductionText(String introductionText) {
		this.introductionText = introductionText;
	}

	public String getIntroductionText() {
		return introductionText;
	}

	public void setPhonePrefix(String phonePrefix) {
		this.phonePrefix = phonePrefix;
	}

	public String getPhonePrefix() {
		return phonePrefix;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}

	public String getPhoneExt() {
		return phoneExt;
	}

	public void setFaxPrefix(String faxPrefix) {
		this.faxPrefix = faxPrefix;
	}

	public String getFaxPrefix() {
		return faxPrefix;
	}

	public void setFaxCode(String faxCode) {
		this.faxCode = faxCode;
	}

	public String getFaxCode() {
		return faxCode;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxExt(String faxExt) {
		this.faxExt = faxExt;
	}

	public String getFaxExt() {
		return faxExt;
	}

	public void setWexinMp(String wexinMp) {
		this.wexinMp = wexinMp;
	}

	public String getWexinMp() {
		return wexinMp;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
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

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setCaseCount(Integer caseCount) {
		this.caseCount = caseCount;
	}

	public Integer getCaseCount() {
		return caseCount;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public List<EnterpriseServiceArea> getServiceAreaList() {
		return serviceAreaList;
	}

	public void setServiceAreaList(List<EnterpriseServiceArea> serviceAreaList) {
		this.serviceAreaList = serviceAreaList;
	}

	public String getServiceAreas() {
		if (this.serviceAreaList == null || this.serviceAreaList.size() == 0) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		for (EnterpriseServiceArea e : this.serviceAreaList) {
			if (e.getProvinceName() != null && !e.getProvinceName().equals("")) {
				sb.append(e.getProvinceName()).append(",");
			}
		}
		if (sb.length() != 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
}
