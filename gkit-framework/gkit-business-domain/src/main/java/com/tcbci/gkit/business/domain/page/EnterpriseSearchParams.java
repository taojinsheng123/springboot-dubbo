package com.tcbci.gkit.business.domain.page;

import java.io.Serializable;

import com.tcbci.gkit.business.page.PageParams;

/**
 * 企业查询参数
 * 
 * @author dongfang
 *
 */
public class EnterpriseSearchParams extends PageParams implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 产品分类
	 */
	private String[] categories;

	/**
	 * 服务区域省
	 */
	private String[] placeProvinces;

	/**
	 * 服务区域市
	 */
	private String[] placeCities;

	/**
	 * 关键字
	 */
	private String[] keywords;

	/**
	 * 用户id，用于判断用户是否收藏
	 */
	private Integer userId;

	private String marketId;

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
