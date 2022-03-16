package com.zp.order.service.test1;

import lombok.Data;

@Data
public class TimeConfigWeeks {

    private String[] weeks;
    private Boolean repeatInDays;
    private String repeatInDaysBegin;
    private String repeatInDaysEnd;
    private Integer showDays;

    public TimeConfigWeeks() {
    }

    public TimeConfigWeeks(String[] weeks, boolean repeatInDays, String repeatInDaysBegin, String repeatInDaysEnd, int showDays) {
        this.weeks = weeks;
        this.repeatInDays = repeatInDays;
        this.repeatInDaysBegin = repeatInDaysBegin;
        this.repeatInDaysEnd = repeatInDaysEnd;
        this.showDays = showDays;
    }
}
