package com.lkcoffee.service;

import com.lkcoffee.pojo.Product;

import java.util.List;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.service
 * @date 2024/5/11 15:21
 */
public interface ProductService {
    List<Product> selectProduct();
    Product selectProductById(Integer id);
    int insertSelective(Product product);
    int deleteById(Integer id);
    int updateProduct(Product product);
    int updateIsActive(Product product);
}
