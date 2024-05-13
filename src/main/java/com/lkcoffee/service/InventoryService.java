package com.lkcoffee.service;

import com.lkcoffee.pojo.Inventory;
import com.lkcoffee.pojo.Product;

import java.util.List;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.service
 * @date 2024/5/11 15:22
 */
public interface InventoryService {
    List<Inventory> selectInventory();
    Inventory selectInventoryById(Integer id);
    int insertSelective(Inventory inventory);
    int deleteById(Integer id);
    int updateInventory(Inventory inventory);
}
