package com.zp.order.service.test1;

public class Tes3 {

    public static void main(String[] args) {
        int  m= 9;

        m= (--m) -1;

        System.out.println(" --m =" +m);
        System.out.println(" (--m) =" +(--m));
        System.out.println(" (--m--1) ="+((--m) -1) );


        int q = 9;

        q= ++q + q - q++;

        System.out.println(" --q =" +q);
    }
}
