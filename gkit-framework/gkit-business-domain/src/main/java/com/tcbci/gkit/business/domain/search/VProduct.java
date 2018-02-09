package com.tcbci.gkit.business.domain.search;

/**
 * V_gb_product 实体类 Fri Dec 02 17:41:48 CST 2016 xukangjing
 */

public class VProduct extends VBase {
	private String productId;// 产品id
	private String enterpriseId;// 所属企业
	private String enterpriseShortName;// 简称
	private String enterpriseFullName;// 公司全名
	private String name;// 产品名称
	private String brandId;// 品牌
	private String brandName;// 品牌名称
	private String model;// 产品型号
	private Integer isPriceSection;// 价格未区间形式
	private String priceUnit;// 计价单位
	private double minPrice;// 计价
	private double maxPrice;// 计价，is_price_section=1时此值有效
	private Integer isPurchaseNegotiable;// 价格是否面议
	private double minPurchasePrice;// 采购价
	private double maxPurchasePrice;// 采购价
	private String placeCountryCode;// 产地国家(有多个的，只存储第一个)
	private String placeCountryName;
	private String placeProvinceCode;
	private String placeProvinceName;
	private String placeCityCode;
	private String placeCityName;
	private String previewImage;

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setIsPriceSection(Integer isPriceSection) {
		this.isPriceSection = isPriceSection;
	}

	public Integer getIsPriceSection() {
		return isPriceSection;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getPriceUnit() {
		return priceUnit;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getMinPrice() {
		return minPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setIsPurchaseNegotiable(Integer isPurchaseNegotiable) {
		this.isPurchaseNegotiable = isPurchaseNegotiable;
	}

	public Integer getIsPurchaseNegotiable() {
		return isPurchaseNegotiable;
	}

	public void setMinPurchasePrice(double minPurchasePrice) {
		this.minPurchasePrice = minPurchasePrice;
	}

	public double getMinPurchasePrice() {
		return minPurchasePrice;
	}

	public void setMaxPurchasePrice(double maxPurchasePrice) {
		this.maxPurchasePrice = maxPurchasePrice;
	}

	public double getMaxPurchasePrice() {
		return maxPurchasePrice;
	}

	public String getPlaceCountryCode() {
		return placeCountryCode;
	}

	public void setPlaceCountryCode(String placeCountryCode) {
		this.placeCountryCode = placeCountryCode;
	}

	public String getPlaceCountryName() {
		return placeCountryName;
	}

	public void setPlaceCountryName(String placeCountryName) {
		this.placeCountryName = placeCountryName;
	}

	public String getPlaceProvinceCode() {
		return placeProvinceCode;
	}

	public void setPlaceProvinceCode(String placeProvinceCode) {
		this.placeProvinceCode = placeProvinceCode;
	}

	public String getPlaceProvinceName() {
		return placeProvinceName;
	}

	public void setPlaceProvinceName(String placeProvinceName) {
		this.placeProvinceName = placeProvinceName;
	}

	public String getPlaceCityCode() {
		return placeCityCode;
	}

	public void setPlaceCityCode(String placeCityCode) {
		this.placeCityCode = placeCityCode;
	}

	public String getPlaceCityName() {
		return placeCityName;
	}

	public void setPlaceCityName(String placeCityName) {
		this.placeCityName = placeCityName;
	}

	public String getPreviewImage() {
		return previewImage;
	}

	public void setPreviewImage(String previewImage) {
		this.previewImage = previewImage;
	}

	public String getPlaceNames() {
		if (this.placeCountryCode == null) {
			return null;
		}
		if (!this.placeCountryCode.equals("86")) {
			return this.placeCountryName;
		}

		if (this.placeProvinceName == null) {
			return null;
		}

		String str = this.placeProvinceName;

		if (this.placeCityName != null) {
			str += "." + this.placeCityName;
		}
		return str;
	}
}
