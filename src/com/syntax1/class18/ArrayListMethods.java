package com.syntax1.class18;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Ksenia");
        arrayList.add("Davit");
        arrayList.add("Mike");
        arrayList.add("Burju");
        arrayList.add("Asghar");
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Ksenia"));
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        ArrayList<String> arrayList2= new ArrayList<>(15);
        arrayList2.add("Olga");
        arrayList2.add("Anya");
        arrayList2.add("Masha");
        arrayList2.add("Sveta");
        arrayList2.add("Nadya");

      arrayList2.addAll(arrayList);
        System.out.println(arrayList2);
arrayList2.addAll(2,arrayList);
        System.out.println(arrayList2);

        int[] arr=new int[2];
        arr[0]=10;
        arr[1]=20;
        System.out.println(Arrays.toString(arr));
        arr[0]=20;
        System.out.println(Arrays.toString(arr));

        //retain-- keeps duplicates


    }
}
