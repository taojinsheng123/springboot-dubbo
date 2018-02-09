package com.tcbci.gkit.business.domain.page;

import java.io.Serializable;

import com.tcbci.gkit.business.page.PageParams;

/**
 * 产品查询参数
 * 
 * @author dongfang
 *
 */
public class ProductSearchParams extends PageParams implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 产品品牌
	 */
	private String[] brandIds;

	/**
	 * 产品分类
	 */
	private String[] categories;

	/**
	 * 产地省份
	 */
	private String[] placeProvinces;

	/**
	 * 产品市
	 */
	private String[] placeCities;

	/**
	 * 产品关键字
	 */
	private String[] keywords;

	/**
	 * 价格区间
	 */
	private Double priceStart;

	/**
	 * 价格区间
	 */
	private Double priceEnd;

	/**
	 * 企业id
	 */
	private String[] enterpriseIds;// 企业id

	/**
	 * 用户id，用于判断用户是否收藏
	 */
	private Integer userId;

	/**
	 * 建材市场Id，用于查询建材市场的品牌
	 */
	private String marketId;

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String[] getBrandIds() {
		return brandIds;
	}

	public void setBrandIds(String[] brandIds) {
		this.brandIds = brandIds;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	public String[] getPlaceProvinces() {
		return placeProvinces;
	}

	public void setPlaceProvinces(String[] placeProvinces) {
		this.placeProvinces = placeProvinces;
	}

	public String[] getPlaceCities() {
		return placeCities;
	}

	public void setPlaceCities(String[] placeCities) {
		this.placeCities = placeCities;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public Double getPriceStart() {
		return priceStart;
	}

	public void setPriceStart(Double priceStart) {
		this.priceStart = priceStart;
	}

	public Double getPriceEnd() {
		return priceEnd;
	}

	public void setPriceEnd(Double priceEnd) {
		this.priceEnd = priceEnd;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String[] getEnterpriseIds() {
		return this.enterpriseIds;
	}

	public void setEnterpriseIds(String[] enterpriseIds) {
		this.enterpriseIds = enterpriseIds;
	}
}
