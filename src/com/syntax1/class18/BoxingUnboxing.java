package com.syntax1.class18;

import java.util.ArrayList;

public class BoxingUnboxing {
    public static void main(String[] args) {


        Integer i = 10; //autoboxing, non primitive into boxing
        //short way

        int primitiveInt = i; //autoUnboxing

        Integer integer = new Integer(10);// Boxing,long way
        int number=integer.intValue();//unboxing
        String string = "Burju";

        ArrayList a=new ArrayList();
        a.add(10);
        a.add(100);
        System.out.println(a.size());

    }
}