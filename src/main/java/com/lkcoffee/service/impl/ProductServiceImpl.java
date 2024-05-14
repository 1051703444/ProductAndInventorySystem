package com.lkcoffee.service.impl;

import com.lkcoffee.dao.ProductDao;
import com.lkcoffee.pojo.Product;
import com.lkcoffee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.service.impl
 * @date 2024/5/11 15:22
 */
public class ProductServiceImpl implements ProductService {
    ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> selectProduct() {
        return productDao.selectProduct();
    }

    @Override
    public Product selectProductById(Integer id) {
        return productDao.selectProductById(id);
    }

    @Override
    public int insertSelective(Product product) {

        int num = productDao.insertSelective(product);
        return num;
    }

    @Override
    public int deleteById(Integer id) {
        return productDao.deleteById(id);
    }

    @Override
    public int updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    @Override
    public int updateIsActive(Product product) {
        return productDao.updateIsActive(product);
    }


}
