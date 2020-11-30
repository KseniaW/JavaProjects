package com.syntax1.class18;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo3 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        System.out.println(arrayList.size());
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove(new Integer(100));
        System.out.println(arrayList);
        arrayList.indexOf(new Integer(200));
        arrayList.clear();
        System.out.println(arrayList);
    }
}
