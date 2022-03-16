package com.zp.order.service.test1;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
public class ProductModel {

    /**不是专享商品*/
    public static final String PRODUCT_VIP_NO = "0";
    /**是专享商品*/
    public static final String PRODUCT_VIP_YES = "1";
    /**非注册会员商品,指升级为会员的那个商品(学习家专用)*/
    public static final String UPGRADE_PRODUCT_VIP_NO = "0";
    /**注册会员商品(学习家专用)*/
    public static final String UPGRADE_PRODUCT_VIP_YES = "1";
    /**商品详情是否显示购物车：是*/
    public static final Integer PRODUCT_ISSHOWCART_YES = 1;
    /**商品详情是否显示购物车：否*/
    public static final Integer PRODUCT_ISSHOWCART_NO = 0;

    private static final long serialVersionUID = -3011738282212311861L;

    private String shopIds;

    /**
     * 商品ID
     */
    private String productId;
    /**
     * 企业ID
     */
    private String companyInfoId;
    /**
     * 社区ID
     */
    private String companyId;
    private List<String> companyIds;
    /**
     * 商户ID
     */
    private String merchantId;
    /**
     * 店铺ID
     */
    private String shopId;
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 封面ID
     */
    private String coverID;
    /**
     * 封面图地址
     */
    private String coverAddr;
    /**
     * 模板ID
     */
    private String templateId;
    /**
     * 商品类型
     */
    private Integer productType;
    /**
     * 上架状态
     * @see
     */
    private Integer saleStatus;
    /**
     * 库存状态
     * @see
     */
    private Integer stockStatus;
    /**
     * 平台关闭状态
     */
    private Integer platClose;
    /**
     * 删除标记
     * @see
     */
    private Integer delFlag;
    /**
     * 商品名称
     */
    private String title;
    /**
     * 商品副标题
     */
    private String subTitle;
    /**
     * 商品最大价格
     */
    private BigDecimal maxPrice;
    /**
     * 商品最小价格
     */
    private BigDecimal minPrice;
    /**
     * 商品最大价格(会员)
     */
    private BigDecimal maxMemberPrice;
    /**
     * 商品最小价格(会员)
     */
    private BigDecimal minMemberPrice;
    /**
     * 价格单位
     */
    private String priceUnit;
    /**
     * 运费
     */
    private BigDecimal logisticsFee;
    /**
     * 商家编码
     */
    private String merchantCode;
    /**
     * 已售数量
     */
    private Long sellCount;
    /**
     * 省代码
     */
    private String province;
    /**
     * 市代码
     */
    private String city;
    /**
     * 区县代码
     */
    private String district;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 经度
     */
    private String lgt;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 服务范围
     */
    private Integer serviceRange;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 商品url（短链）
     */
    private String url;
    /**
     * 评价数量
     */
    private Long commentCount;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Timestamp createdTime;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Timestamp updateTime;

    /**
     * 省ID
     */
    private String provinceID;

    /**
     * 市ID
     */
    private String cityID;

    /**
     * 区ID
     */
    private String districtID;

    /**
     * 地标名称
     */
    private String locationName;

    /**
     * 商品模板ID
     *
     * @return
     */
    private String productTemplateID;

    /**
     * 商品模板名称
     *
     * @return
     */
    private String productTemplateName;

    /**
     * 已卖商品总金额
     *
     * @return
     */
    private BigDecimal sellAmount;

    /**
     * 已买商品总人数
     *
     * @return
     */
    private Integer buyUserCount;
    /**
     * 会员专享
     *
     * @return
     */
    private String isVipProduct;
    /**
     * 是否显示购物车
     */
    private Integer isShowCart;

    /**
     * 购买后升级为VIP
     */
    private String upgradeVipProduct;

    /**
     * 商品模板类型
     */
    private Integer commodityTemplateType;
    /**
     * 商品最大兑换次数
     */
    private Double maxExchangeNumber;
    /**
     * 商品最大兑换数量
     */
    private Double productMaxExchangeNumber;

    /**
     * 原商品ID
     */
    private String sourceProductID;
    /**
     * 外部系统导入业务ID
     */
    private String outsideImportSystemID;

    /**
     * 外部系统导入业务名
     */
    private String outsideImportSystemName;

    /**
     * 关联内部系统ID
     */
    private String insideItemId;

    /**
     * 外部系统导入业务名
     */
    private String insideItemName;

    /**
     * 产品地址,用于学习家定制版属性,本次通过判断对标准产品进行屏蔽-wangx-20160511
     */
    private String productAddr;

    /**
     * 产品最低原价
     */
    private BigDecimal minOldPrice;

    /**
     * 产品最高原价
     */
    private BigDecimal maxOldPrice;

    /**
     * 如果产品有时间规格,则设置距离当天最近的时间,这里做冗余数据,来源于eb_product_sku表
     */
    private Timestamp beginTime;

    /**
     * 视频地址
     */
    private String videoAddr;

    /**
     * 观看视频按钮名称
     */
    private String videoBtnstr;

    /**
     * 视频类型
     */
    private int videoType;

    /**
     * 有效期天数(-1代表永久) (目前用于视频课程)
     */
    private Integer validDays = -1;

    /**
     * 视频列表
     */
    private List<ProductCourseVideo> videoList;

    /**
     * 资料列表
     */
    private List<ProductCourseMaterial> materialList;

    /**
     * 是否限制购买
     */
    private String isBuyPointLimited;

    /**
     * 购买限制积分类型ID
     */
    private String limitedPointTypeID;

    /**
     * 购买限制积分类型名称
     */
    private String limitedPointTypeName;

    /**
     * 购买限制积分数
     */
    private String limitedPointNum;

    /**
     * 是否购买增加积分
     */
    private String isPayAddPoint;

    /**
     * 支付增加积分类型ID
     */
    private String payAddPointTypeID;

    /**
     * 支付增加积分类型名称
     */
    private String payAddPointTypeName;

    /**
     * 支付增加积分数
     */
    private String payAddPointNum;
    /**
     * 免费商品是否显示价格  1：显示 0：不显示
     */
    private Integer freeDisplayFlag;

    /**
     * 苹果内购产品ID
     */
    private String applePayProductID;
    /**
     * 是否为推荐商品 1为推荐 0为不推荐
     */
    private String recommend;

    /**
     * 商品属性
     * @see
     */
    private Integer productProperty;

    /**
     * 商品关联社区,是否关联全部社区
     * 0:全部关联  1:部分关联
     */
    private String companySubType;

    /**
     * 是否预约模式
     */
    private String isReservation;

    /**
     * 分佣比例
     */
    private BigDecimal brokerageScale;

    /**
     * 进项税率
     */
    private BigDecimal inputTaxRate;

    /**
     * 销项税率
     */
    private BigDecimal outputTaxRate;

    /**
     * 供应商ID
     */
    private String supplierID;
    /**
     * 供应商名称
     */
    private String supplierName;


    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 供应商系统的分佣比例
     */
    private BigDecimal oldBrokerageScale;
    /**
     * 结算类型
     */
    @Deprecated
    private Integer settlementTemplateType;
    /**
     * 结算模板id
     */
    @Deprecated
    private String settlementTemplateId;

    /**
     * 商品导入发布状态 0 未发布 1 已发布
     */
    private Integer publishStatus;

    private BigDecimal agentProceedsRatio;

    private String agentRuleID;

    /**
     * 商家进货价
     */
    private BigDecimal storeStockUpPrice;

    /**
     * 商家进货渠道
     */
    private String stockUpChannel;
}
