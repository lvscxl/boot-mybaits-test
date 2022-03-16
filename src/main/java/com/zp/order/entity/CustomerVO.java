package com.zp.order.entity;

import lombok.Data;

import java.util.List;

@Data
public class CustomerVO {

    private String id;
    private String name;

    private String parentId;

    private Integer status;
    private List<CustomerVO> children;
}
