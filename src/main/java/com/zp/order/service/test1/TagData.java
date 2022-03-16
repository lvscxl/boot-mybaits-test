package com.zp.order.service.test1;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TagData {

    private static final long serialVersionUID = 0L;
    private String skuId;
    private BigDecimal price;
    private Integer stock;
    private String merchantCode;
    private BigDecimal oldPrice;
    private BigDecimal freeShippingAmount;
    private BigDecimal logisticsFee;
    private BigDecimal costPrice;
    private String identifierId;
    private String materialLibraryId;
}
