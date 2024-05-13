package com.lkcoffee.pojo;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.model
 * @date 2024/5/11 15:25
 */
@Data
@Builder
public class Inventory {
    private Integer inventoryId;
    private Integer productId;
    private Integer quantity;
}
