package com.zp.order.service.test1;

import com.zp.order.entity.School;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {

    public static void main(String[] args) {

        List<School> objects = new ArrayList<>();

        School school = new School();
        //集合添加空对象
        objects.add(null);

        //集合添加对象的id为空
        school.setId(null);
        school.setUserId("00");

        objects.add(school);
        School school1 = new School();
        school1.setId(1);
        school1.setUserId("01");
        objects.add(school1);


        School school3 = new School();
        school3.setId(3);
        school3.setUserId("03");
        objects.add(school3);

        School school2 = new School();
        school2.setId(2);
        school2.setUserId("02");
        objects.add(school2);


        //objects.sort(Comparator.comparing(School::getId, Comparator.nullsLast(Comparator.naturalOrder())));
        //objects.sort(Comparator.nullsLast(Comparator.comparing(School::getId, Comparator.nullsLast(Comparator.naturalOrder()))));

        //Collections.sort(objects, Comparator.nullsLast(Comparator.comparing(School::getId)));

        // 可以去两次空
        //objects.sort(Comparator.nullsLast(Comparator.comparing(School::getId, Comparator.nullsLast(Comparator.naturalOrder()))));
        // 可以去两次空， stream 一次， Comparator.nullsLast 一次
        List<School> collect = objects.stream().sorted(Comparator.comparing(School::getId, Comparator.nullsFirst(Integer::compareTo))).collect(Collectors.toList());



        objects.stream().forEach( item -> {
            if (ObjectUtils.isEmpty(item)){

            } else{
                if (ObjectUtils.isEmpty(item.getId())){

                }else {
                    System.out.println(item.getId());
                }

            }
        });
//        objects.forEach( item -> {
//            if (ObjectUtils.isEmpty(item)){
//
//            } else{
//                if (ObjectUtils.isEmpty(item.getId())){
//
//                }else {
//                    System.out.println(item.getId());
//                }
//
//            }
//
//        });


    }
}
