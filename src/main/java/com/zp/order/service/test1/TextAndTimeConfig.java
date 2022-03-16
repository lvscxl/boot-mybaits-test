package com.zp.order.service.test1;

import lombok.Data;

@Data
public class TextAndTimeConfig {
    private TextItem tagL1;
    private TimeConfig timeConfig;
    private TagData[] tagDatas;

    public TextAndTimeConfig() {
    }

    public TextAndTimeConfig(TextItem tagL1, TimeConfig timeConfig, TagData[] tagDatas) {
        this.tagL1 = tagL1;
        this.timeConfig = timeConfig;
        this.tagDatas = tagDatas;
    }
}
