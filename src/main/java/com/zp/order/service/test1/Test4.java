package com.zp.order.service.test1;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

public class Test4 {
    private static final String PHONE_PATTERN_TEST= "(?:0|86|\\+86)?1[3456789]\\d{9}";
    public static void main(String[] args) {
        //ArrayList<Object> objects = new ArrayList<>();

        String phone1 ="134566898989";
        String phone2 ="18272733670";
        String phone ="19834099753";

        if (phone.matches(PHONE_PATTERN_TEST)) {
            System.out.println("aaa");
        }

        //String abc ="1234567";
        String abc = null;
        if (abc.matches(("[0-9]{6}"))) {
            System.out.println("objects.size()");

        }




//        ArrayList<Object> objects = null;
//        //objects.add(null);
//        System.out.println(ObjectUtils.isEmpty(objects));
//        System.out.println(objects.size());
//
//        objects.add(8);
//        System.out.println(objects.size());


    }
}
