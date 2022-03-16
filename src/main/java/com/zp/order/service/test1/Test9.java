package com.zp.order.service.test1;


import com.zp.order.entity.City;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test9 {

    public static void main(String[] args) {

        City city = new City();
        //City build = City.builder().id("123").name("张三").status(1).build();

        //City.CityBuilder ct = City.builder().id("123").name("张三").status(1);

        List<String> personByIds = new ArrayList<>();
        if (CollectionUtils.isEmpty(personByIds)) {
            System.out.println(" null");
        }else {
            System.out.println(" not null");
        }

        System.out.println( new Date());
    }
}
