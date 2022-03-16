package com.zp.order.service.test1;

import lombok.Data;

@Data
public class TextItem {
    private static final long serialVersionUID = -423282507861133434L;
    private String tagLabel;
    private String[] tagNames;
    private String[] pics;
    private String[] addrs;

    public TextItem() {
    }

    public TextItem(String tagLabel, String[] tagNames, String[] pics) {
        this.tagLabel = tagLabel;
        this.tagNames = tagNames;
        this.pics = pics;
    }
}
