package com.tcbci.gkit.business.entity.product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.tcbci.gkit.business.domain.product.Product;

@Mapper
public interface ProductMapper {

	void insert(Product object);

	void update(Product object);

	void delete(@Param("id") Integer id);

	@Select("SELECT * FROM t_gb_product WHERE id = #{id}")
	Product findById( Integer id);

	List<Product> queryByIds(Integer[] ids);

	void deleteByIds(Integer[] Ids);

	List<Product> queryAll();

	void inserts(List<Product> list);

	List<Product> listByObject(Product object);

	Product get(@Param("productId") String productId, @Param("flag") Integer flag);

	List<Product> getCollectProduct(@Param("user") Integer user, @Param("count") Integer count);

	List<Product> selectByEnterpriseId(@Param("enterpriseId") String enterpriseId, @Param("count") Integer count);

	List<Product> queryByProductIds(String[] productIds);

	void setProductWeight(Integer id);

	List<String> findByMarketId(@Param("marketId") String marketId);
}