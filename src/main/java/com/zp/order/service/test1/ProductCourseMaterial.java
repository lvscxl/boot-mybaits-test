package com.zp.order.service.test1;

import lombok.Data;

import java.util.Date;

@Data
public class ProductCourseMaterial {
    private String productCourseMaterialID; // 主键 ID
    private String companyID; // companyID
    private String companyInfoID; // companyInfoID
    private String productId; // 商品 ID

    private String materialTitle; // 标题
    private String materialType; // 类型,1:文件 ; 2:图册
    private String fileID = ""; // 文件ID(图册为空)
    private String materialFileExt = ""; // 文件类型(后缀 pdf, doc, ppt, jpg, etc)
    private String materialSize; // 文件大小/图册图片数量

    private Integer materialOrder; // 排序(从0开始)
    private Date createTime; // 创建时间
    private String cdnDomainHTTP;
    private String originalCDNAddr;

}
