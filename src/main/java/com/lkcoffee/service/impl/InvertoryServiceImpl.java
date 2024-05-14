package com.lkcoffee.service.impl;

import com.lkcoffee.dao.InventoryDao;
import com.lkcoffee.pojo.Inventory;
import com.lkcoffee.pojo.Product;
import com.lkcoffee.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.service.impl
 * @date 2024/5/11 15:23
 */

public class InvertoryServiceImpl implements InventoryService {
    InventoryDao inventoryDao;

    public void setInventoryDao(InventoryDao inventoryDao) {
        this.inventoryDao = inventoryDao;
    }

    @Override
    public List<Inventory> selectInventory() {
        return inventoryDao.selectInventory();
    }

    @Override
    public Inventory selectInventoryById(Integer id) {
        return inventoryDao.selectInventoryById(id);
    }

    @Override
    public int insertSelective(Inventory inventory) {
        return inventoryDao.insertSelective(inventory);
    }

    @Override
    public int deleteById(Integer id) {
        return inventoryDao.deleteById(id);
    }


    @Override
    public int updateInventory(Inventory inventory) {
        return inventoryDao.updateInventory(inventory);
    }
}
