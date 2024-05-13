package com.lkcoffee.pojo;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.lkcoffee.model
 * @date 2024/5/11 15:24
 */
@Data
@Builder
public class Product {
    private Integer productId;
    private String name;
    private BigDecimal price;
    private boolean isActive;
}
