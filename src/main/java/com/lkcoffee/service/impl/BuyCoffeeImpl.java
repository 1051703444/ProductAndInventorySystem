package com.lkcoffee.service.impl;

import com.lkcoffee.dao.ProductDao;
import com.lkcoffee.service.BuyCoffee;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.service.impl
 * @date 2024/5/14 13:54
 */
public class BuyCoffeeImpl implements BuyCoffee {
    ProductDao productDao;



    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void buyCoffee() {
        productDao.deleteById(9);
        int a=1/0;
        productDao.deleteById(10);
    }
}
