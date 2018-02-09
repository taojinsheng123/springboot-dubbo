package com.tcbci.gkit.business.domain.page;

import java.io.Serializable;

import com.tcbci.gkit.business.page.PageParams;

/**
 * 分页
 * 
 * @author dongfang
 *
 */
public class StandardParams extends PageParams implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] keywords;

	private Integer[] levelIds;

	private Integer[] categoryIds;

	private Integer[] validations;

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public Integer[] getLevelIds() {
		return levelIds;
	}

	public void setLevelIds(Integer[] levelIds) {
		this.levelIds = levelIds;
	}

	public Integer[] getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(Integer[] categoryIds) {
		this.categoryIds = categoryIds;
	}

	public Integer[] getValidations() {
		return validations;
	}

	public void setValidations(Integer[] validations) {
		this.validations = validations;
	}
}
