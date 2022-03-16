package com.zp.order.service.test1;

import lombok.Data;

@Data
public class TextConfig {

    private TextItem tagL1;
    private TextItem tagL2;
    private TextItem tagL3;
    private TagData[] tagDatas;

    public TextConfig() {
    }

    public TextConfig(TextItem tagL1, TextItem tagL2, TextItem tagL3, TagData[] tagDatas) {
        this.tagL1 = tagL1;
        this.tagL2 = tagL2;
        this.tagL3 = tagL3;
        this.tagDatas = tagDatas;
    }
}
