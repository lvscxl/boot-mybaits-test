package com.zp.order.service.test1;

import lombok.Data;

import java.util.Date;

@Data
public class TagConfig {
    public static final String DAY_FORMAT = "yyyy-MM-dd";
    public static final String DAY_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String TIME_MINUTES_FORMAT = "HH:mm";
    private Boolean isNew;
    private String tagId;
    private String productId;
    private String companyId;
    private Integer tagType;
    private String priceUnit;
    private EmptyConfig emptyConfig;
    private TextConfig textConfig;
    private TimeConfig timeConfig;
    private TextAndTimeConfig textAndTimeConfig;
    private Date updateTime;
    private Date lastCleanTime;
}
