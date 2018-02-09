package com.tcbci.gkit.business.domain.product;

import com.tcbci.gkit.business.page.PageParams;

public class SearchKeyword extends PageParams {
	private Integer id;// 自增

	private String searchKeyword; // 关键词

	private Integer resultCount; // 结果数量

	private Integer isNewWord; // 是否为新词

	private Integer clickCount; // 点击数

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public Integer getResultCount() {
		return resultCount;
	}

	public void setResultCount(Integer resultCount) {
		this.resultCount = resultCount;
	}

	public Integer getIsNewWord() {
		return isNewWord;
	}

	public void setIsNewWord(Integer isNewWord) {
		this.isNewWord = isNewWord;
	}

	public Integer getClickCount() {
		return clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

}
