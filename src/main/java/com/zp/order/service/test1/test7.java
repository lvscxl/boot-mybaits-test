package com.zp.order.service.test1;

import com.zp.order.entity.School;
import org.apache.commons.lang3.StringUtils;

public class test7 {

    public static void main(String[] args) {

        School school = new School();
        school.setSchoolName("");
        school.setId(1);


        School school2 = new School();
        school2.setSchoolName("  ");
        school2.setId(2);

        School school3 = new School();
        school3.setSchoolName(null);
        school3.setId(3);


        if (StringUtils.equals(school.getSchoolName(), school3.getSchoolName())) {
            System.out.println(" ====");
        }else {
            System.out.println(" !====");
        }

    }
}
