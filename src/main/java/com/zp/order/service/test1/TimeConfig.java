package com.zp.order.service.test1;

import lombok.Data;

@Data
public class TimeConfig {
    private TimeConfigWeeks weeks;
    private TimeConfigDays days;
    private Integer appointment;
    private String appointmentUnit;
    private Integer selectMaxDays;
    private String[] dayTimeSection;
    private TagData[] tagDatas;

    public TimeConfig() {
    }

    public TimeConfig(TimeConfigDays days, int appointment, String appointmentUnit, int selectMaxDays, String[] dayTimeSection, TagData[] tagDatas) {
        this.days = days;
        this.appointment = appointment;
        this.appointmentUnit = appointmentUnit;
        this.dayTimeSection = dayTimeSection;
        this.selectMaxDays = selectMaxDays;
        this.tagDatas = tagDatas;
    }

    public TimeConfig(TimeConfigWeeks weeks, int appointment, String appointmentUnit, int selectMaxDays, String[] dayTimeSection, TagData[] tagDatas) {
        this.weeks = weeks;
        this.appointment = appointment;
        this.appointmentUnit = appointmentUnit;
        this.dayTimeSection = dayTimeSection;
        this.selectMaxDays = selectMaxDays;
        this.tagDatas = tagDatas;
    }
}
