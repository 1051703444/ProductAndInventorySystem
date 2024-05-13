package com.lkcoffee;

import com.lkcoffee.dao.ProductDao;
import com.lkcoffee.pojo.Product;
import com.lkcoffee.service.impl.InvertoryServiceImpl;
import com.lkcoffee.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.crypto.interfaces.PBEKey;
import java.math.BigDecimal;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description 测试类
 * @Package com.lkcoffee
 * @date 2024/5/11 16:10
 */
public class TestProductInventory {
    @Test
    public void testSpringIoc(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
    @Test
    public  void testSpringMybatisDao(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ProductDao productDao = (ProductDao) classPathXmlApplicationContext.getBean("productDao");
        System.out.println();
    }

    @Test
    public void testProductServiceSelect(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ProductServiceImpl productServiceImpl = (ProductServiceImpl) classPathXmlApplicationContext.getBean("ProductServiceImpl");
        System.out.println(productServiceImpl.selectProductById(1));

    }
    @Test
    public void testProductServiceInsert(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ProductServiceImpl productServiceImpl = (ProductServiceImpl) classPathXmlApplicationContext.getBean("ProductServiceImpl");
        Product product = Product.builder()
                .name("黑糖冲绳拿铁")
                .price(BigDecimal.valueOf(13.5))
                .isActive(true).build();
        System.out.println(productServiceImpl.insertSelective(product));
    }

    @Test
    public void testProductServiceDelete(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ProductServiceImpl productServiceImpl = (ProductServiceImpl) classPathXmlApplicationContext.getBean("ProductServiceImpl");
        System.out.println(productServiceImpl.deleteById(5));
    }

    @Test
    public void testProductServiceUpdate(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ProductServiceImpl productServiceImpl = (ProductServiceImpl) classPathXmlApplicationContext.getBean("ProductServiceImpl");
        Product product = Product.builder()
                .productId(3)
                .price(BigDecimal.valueOf(15))
                .build();
        System.out.println(productServiceImpl.updateProduct(product));
    }

    @Test
    public void testInventorySelect(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        InvertoryServiceImpl inventoryServiceImpl = (InvertoryServiceImpl) classPathXmlApplicationContext.getBean("InventoryServiceImpl");
        //System.out.println(inventoryServiceImpl.selectInventory());
        System.out.println(inventoryServiceImpl.selectInventoryById(1));
    }


}
