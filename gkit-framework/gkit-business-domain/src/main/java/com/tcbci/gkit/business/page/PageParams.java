package com.tcbci.gkit.business.page;

/**
 * @ClassName: PageParams
 * @Description: 分页查询参数基类
 * @author wangqiang
 * @date 2016年8月9日 下午1:34:14
 *
 */
public class PageParams {

	private Integer page = 1;

	private Integer rows = 20;

	private String order;

	private Integer isDelete;

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
