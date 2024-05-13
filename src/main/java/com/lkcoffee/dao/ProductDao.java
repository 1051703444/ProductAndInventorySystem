package com.lkcoffee.dao;

import com.lkcoffee.pojo.Inventory;
import com.lkcoffee.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Product dao.
 *
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.dao
 * @date 2024 /5/11 15:31
 */
public interface ProductDao {
    /**
     * 查询商品列表
     *
     * @return the list
     */
    List<Product> selectProduct();

    /**
     * 通过Id查询单个商品
     *
     * @param id the id
     * @return the product
     */
    Product selectProductById(@Param("product_id") Integer id);

    /**
     * 插入商品
     *
     * @param product the product
     * @return the int
     */
    int insertSelective(Product product);

    /**
     * 删除商品
     *
     * @param id the id
     * @return the int
     */
    int deleteById(@Param("id") Integer id);

    /**
     * 修改商品
     *
     * @param product the product
     * @return the int
     */
    int updateProduct(Product product);

    /**
     * 实现商品上下架
     *
     * @param product the product
     * @return the int
     */
    int updateIsActive(Product product);

    /**
     * 实现商品的批量删除
     *
     * @return the int
     */
    int deleteMore(@Param("ids")String ids);
}
