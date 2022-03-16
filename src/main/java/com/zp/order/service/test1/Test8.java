package com.zp.order.service.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test8 {

    public static void main(String[] args) {

        List<List<String>> objects = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("12");
        list1.add("123");
        List<String> list2 = new ArrayList<>();
        list2.add("12");
        list2.add("124");

        objects.add(list1);
        objects.add(list2);

       //list1.retainAll(list2);

        List<String> objects1 = new ArrayList<>();
        List<String> collect = objects.stream().reduce((a, b) -> {
            a.retainAll(b);
            return a;
        }).orElse(objects1).stream().collect(Collectors.toList());

        for (String s : collect) {
            System.out.println(" collect: " + s);
        }
        for (String s : list2) {
            System.out.println(" l2: " + s);
        }

        for (String s : list1) {
            System.out.println(" l1: " + s);
        }
    }
}
