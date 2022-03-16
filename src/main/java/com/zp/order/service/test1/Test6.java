package com.zp.order.service.test1;

import com.zp.order.entity.School;

import java.util.ArrayList;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {


        List<School> list = new ArrayList<>();
        School school = new School();
        school.setId(2);
        school.setSchoolName("01");
        list.add(school);

        School school1 = new School();
        school1.setId(2);
        school1.setSchoolName("02");
        list.add(school1);
        //list.\


        Integer a = 0;
        Long b = 0L;
        Long d ;
        Long c;


        d = Long.valueOf(a -1);
        System.out.println("d :" + d);

        System.out.println("d :  =====" + d);
        c = b+ 1;
        System.out.println("c :" + c);

//        if (list.size() >2) {
//            d = Long.valueOf(a -1);
//            System.out.println("d :" + d);
//        }else {
//            c = b+ 1;
//            System.out.println("c :" + c);
//        }

    }
}
