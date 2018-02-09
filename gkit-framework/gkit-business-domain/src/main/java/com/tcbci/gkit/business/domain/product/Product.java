package com.tcbci.gkit.business.domain.product;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * T_gb_product 实体类 Fri Nov 11 16:15:17 CST 2016 yuhuaqiu
 */

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// 自增
	private String productId;// 产品id
	private String enterpriseId;// 所属企业
	private String enterpriseFullName;// 产品企业名称
	private String enterpriseShortName;// 产品企业名称
	private String name;// 产品名称
	private String categoryCode;// 产品分类
	private String categoryPath;// 分类路径
	private String categoryName;// 产品分类名称
	private String categoryExtName;// 产品分类扩展名称
	private String brandId;// 品牌
	private String brandName;// 品牌名称
	private String model;// 产品型号
	private Integer isPriceSection;// 价格未区间形式
	private String priceUnit;// 计价单位
	private Double minPrice;// 计价
	private Double maxPrice;// 计价，is_price_section=1时此值有效
	private Integer isPurchaseNegotiable;// 价格是否面议
	private Double minPurchasePrice;// 采购价
	private Double maxPurchasePrice;// 采购价
	private String basicParameter;// 基本参数
	private String basicParameterText;// 基本参数 纯文本
	private String technicalIndex;// 技术指标
	private String technicalIndexText;// 技术指标 纯文本
	private String description;// 产品描述
	private String descriptionText;// 产品描述 纯文本
	private Integer drawingType;// 图纸类型 1.3D 3.BIM 3.CAD
	private Integer flag;// 标识 0.表示此版本为用户管理版本(用户编辑、审核的为此版本) 1.表示此版本为其它用户查看版本
	private Integer isShelve;// 是否上架 1.是
	private Integer clickCount;// 产品点击次数
	private Integer status;// 状态 0.待提交 1.已提交，待审核 2.已审核 10.审核退回
	private Integer createUser;// 创建人
	private Date createDate;// 创建时间
	private Integer editUser;// 编辑人
	private Date editDate;// 更新人
	private Integer submitUser;//
	private Date submitDate;// 提交时间
	private Integer auditUser;// 审核人员
	private String auditUserName;// 审核人员
	private String auditUserTrueName;// 审核人员真实姓名
	private Date auditDate;// 审核时间
	private Integer isDelete;// 是否删除 1.是
	private Integer deleteUser;// 删除人
	private Date deleteDate;// 删除时间
	private Integer seq;// 综合排序
	private Integer baseWeight;// 基础综合排序权重
	private Integer createUserScope;// 标识 0.前台 1.后台
	private Integer editUserScope;// 标识 0.前台 1.后台
	private Integer submitUserScope;// 标识 0.前台 1.后台
	private Integer seriesId;// 系列id
	private String seriesName;// 系列名称
	private String previewImage; // 预览图片
	private String placeCountryCode;
	private String placeCountryName;
	private String placeProvinceCode;
	private String placeProvinceName;
	private String placeCityCode;
	private String placeCityName;

	private List<ProductPlace> productPlaceList;// 产品产地
	private List<ProductCase> productCaseList;// 产品案例
	private List<ProductDrawing> productDrawingList;// 产品图纸
	private List<ProductImage> productImageList;// 产品图片
	private List<ProductSample> productSampleList;// 产品样本
	private List<ProductCertification> productCertificationList;// 产品认证

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public Integer getCreateUserScope() {
		return createUserScope;
	}

	public void setCreateUserScope(Integer createUserScope) {
		this.createUserScope = createUserScope;
	}

	public Integer getEditUserScope() {
		return editUserScope;
	}

	public void setEditUserScope(Integer editUserScope) {
		this.editUserScope = editUserScope;
	}

	public Integer getSubmitUserScope() {
		return submitUserScope;
	}

	public void setSubmitUserScope(Integer submitUserScope) {
		this.submitUserScope = submitUserScope;
	}

	public Integer getBaseWeight() {
		return baseWeight;
	}

	public void setBaseWeight(Integer baseWeight) {
		this.baseWeight = baseWeight;
	}

	public List<ProductCase> getProductCaseList() {
		return productCaseList;
	}

	public void setProductCaseList(List<ProductCase> productCaseList) {
		this.productCaseList = productCaseList;
	}

	public List<ProductDrawing> getProductDrawingList() {
		return productDrawingList;
	}

	public void setProductDrawingList(List<ProductDrawing> productDrawingList) {
		this.productDrawingList = productDrawingList;
	}

	public List<ProductImage> getProductImageList() {
		return productImageList;
	}

	public void setProductImageList(List<ProductImage> productImageList) {
		this.productImageList = productImageList;
	}

	public List<ProductSample> getProductSampleList() {
		return productSampleList;
	}

	public void setProductSampleList(List<ProductSample> productSampleList) {
		this.productSampleList = productSampleList;
	}

	public List<ProductCertification> getProductCertificationList() {
		return productCertificationList;
	}

	public void setProductCertificationList(List<ProductCertification> productCertificationList) {
		this.productCertificationList = productCertificationList;
	}

	public List<ProductPlace> getProductPlaceList() {
		return productPlaceList;
	}

	public void setProductPlaceList(List<ProductPlace> productPlaceList) {
		this.productPlaceList = productPlaceList;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

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

	public String getEnterpriseFullName() {
		return enterpriseFullName;
	}

	public void setEnterpriseFullName(String enterpriseFullName) {
		this.enterpriseFullName = enterpriseFullName;
	}

	public String getEnterpriseShortName() {
		return enterpriseShortName;
	}

	public void setEnterpriseShortName(String enterpriseShortName) {
		this.enterpriseShortName = enterpriseShortName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getCategoryPath() {
		return categoryPath;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandId() {
		return brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
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

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Double getMaxPrice() {
		return maxPrice;
	}

	public void setIsPurchaseNegotiable(Integer isPurchaseNegotiable) {
		this.isPurchaseNegotiable = isPurchaseNegotiable;
	}

	public Integer getIsPurchaseNegotiable() {
		return isPurchaseNegotiable;
	}

	public void setMinPurchasePrice(Double minPurchasePrice) {
		this.minPurchasePrice = minPurchasePrice;
	}

	public Double getMinPurchasePrice() {
		return minPurchasePrice;
	}

	public void setMaxPurchasePrice(Double maxPurchasePrice) {
		this.maxPurchasePrice = maxPurchasePrice;
	}

	public Double getMaxPurchasePrice() {
		return maxPurchasePrice;
	}

	public void setBasicParameter(String basicParameter) {
		this.basicParameter = basicParameter;
	}

	public String getBasicParameter() {
		return basicParameter;
	}

	public void setBasicParameterText(String basicParameterText) {
		this.basicParameterText = basicParameterText;
	}

	public String getBasicParameterText() {
		return basicParameterText;
	}

	public void setTechnicalIndex(String technicalIndex) {
		this.technicalIndex = technicalIndex;
	}

	public String getTechnicalIndex() {
		return technicalIndex;
	}

	public void setTechnicalIndexText(String technicalIndexText) {
		this.technicalIndexText = technicalIndexText;
	}

	public String getTechnicalIndexText() {
		return technicalIndexText;
	}

	public void setDescription(String description) {
		// try {
		// if (description != null)
		// this.description = URLDecoder.decode(description, "utf-8");
		// } catch (Throwable e) {
		// e.printStackTrace();
		this.description = description;
		// }
	}

	public String getDescription() {
		return description;
	}

	public void setDescriptionText(String descriptionText) {
		// try {
		// if (descriptionText != null)
		// this.descriptionText = URLDecoder.decode(descriptionText, "utf-8");
		// } catch (Throwable e) {
		// e.printStackTrace();
		this.descriptionText = descriptionText;
		// }
	}

	public String getDescriptionText() {
		return descriptionText;
	}

	public void setDrawingType(Integer drawingType) {
		this.drawingType = drawingType;
	}

	public Integer getDrawingType() {
		return drawingType;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setIsShelve(Integer isShelve) {
		this.isShelve = isShelve;
	}

	public Integer getIsShelve() {
		return isShelve;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Integer getClickCount() {
		return clickCount;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setEditUser(Integer editUser) {
		this.editUser = editUser;
	}

	public Integer getEditUser() {
		return editUser;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setSubmitUser(Integer submitUser) {
		this.submitUser = submitUser;
	}

	public Integer getSubmitUser() {
		return submitUser;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setAuditUser(Integer auditUser) {
		this.auditUser = auditUser;
	}

	public Integer getAuditUser() {
		return auditUser;
	}

	public void setAuditUserName(String auditUserName) {
		this.auditUserName = auditUserName;
	}

	public String getAuditUserName() {
		return auditUserName;
	}

	public void setAuditUserTrueName(String auditUserTrueName) {
		this.auditUserTrueName = auditUserTrueName;
	}

	public String getAuditUserTrueName() {
		return auditUserTrueName;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setDeleteUser(Integer deleteUser) {
		this.deleteUser = deleteUser;
	}

	public Integer getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getFirstImage() {
		if (this.productImageList != null && this.productImageList.size() != 0) {
			List<ProductImage> first = this.productImageList.stream()
					.filter(s -> s.getUrl() != null && !s.getUrl().equals("")).collect(Collectors.toList());
			if (first.size() != 0) {
				return first.get(0).getUrl();
			}
		}
		return null;
	}

	public String getCategoryExtName() {
		return categoryExtName;
	}

	public void setCategoryExtName(String categoryExtName) {
		this.categoryExtName = categoryExtName;
	}

	public String getPreviewImage() {
		return previewImage;
	}

	public void setPreviewImage(String previewImage) {
		this.previewImage = previewImage;
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
}
