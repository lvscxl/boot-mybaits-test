package com.zp.order.service.test1;

public class Test {

    public static void main(String[] args) {
        int  m= 9;

        m= (m--) -1;

        int q = m-1;

        System.out.println(" q-- =" +q);
        System.out.println(" m-- =" +m);
        System.out.println(" (m--) =" +(m--));
        System.out.println(" (m--1) ="+((m--) -1) );

        int n = 9;
        n = (n++) -1;

        System.out.println(" n++ =" +n);
        System.out.println(" (n++) =" +(n++));

    }
}
