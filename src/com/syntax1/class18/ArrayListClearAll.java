package com.syntax1.class18;

import java.util.ArrayList;

public class ArrayListClearAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Ksenia");
        arrayList.add("Davit");
        arrayList.add("Mike");
        arrayList.add("Burju");
        arrayList.add("Asghar");
        System.out.println(arrayList);
       arrayList.clear();
        System.out.println(arrayList);
    }
}
