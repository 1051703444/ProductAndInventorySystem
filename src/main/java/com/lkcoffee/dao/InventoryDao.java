package com.lkcoffee.dao;

import com.lkcoffee.pojo.Inventory;
import com.lkcoffee.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Inventory dao.
 *
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.dao
 * @date 2024 /5/11 15:31
 */
public interface InventoryDao {
    /**
     * 查询库存列表
     *
     * @return the list
     */
    List<Inventory> selectInventory();

    /**
     * Select inventory by id inventory.
     *
     * @param id the id
     * @return the inventory
     */
    Inventory selectInventoryById(@Param("inventory_id") Integer id);

    /**
     * Insert selective int.
     *
     * @param inventory the inventory
     * @return the int
     */
    int insertSelective(Inventory inventory);

    /**
     * Delete by id int.
     *
     * @param id the id
     * @return the int
     */
    int deleteById(@Param("id") Integer id);

    /**
     * Update inventory int.
     *
     * @param inventory the inventory
     * @return the int
     */
    int updateInventory(Inventory inventory);
}
