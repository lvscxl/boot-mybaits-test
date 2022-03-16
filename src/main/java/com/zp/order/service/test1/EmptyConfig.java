package com.zp.order.service.test1;

import lombok.Data;

@Data
public class EmptyConfig {

    private TagData tagData;

    public EmptyConfig() {
    }


    public EmptyConfig(TagData tagData) {
        this.tagData = tagData;
    }

    public String toString() {
        return "EmptyConfig{tagData=" + this.tagData + '}';
    }

    public TagData getTagData() {
        return this.tagData;
    }

    public void setTagData(TagData tagData) {
        this.tagData = tagData;
    }
}
