package com.zp.order.service.test1;

import lombok.Data;

import java.util.Date;

@Data
public class ProductCourseVideo {

    private String productCourseVideoID; // 主键 ID
    private String productId; // 商品 ID
    private String videoTitle; // 标题
    private String videoUrl; // 链接
    private Integer videoOrder; // 排序
    private Date createTime; // 结束时间
    private String videoSource;

    public ProductCourseVideo() {

    }
}
