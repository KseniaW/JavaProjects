package com.syntax1.class18;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Toyota");
        arrayList.add("Tesla");
        arrayList.add("Lexus");
        arrayList.add("Mercedez");
        arrayList.add("BMW");

        System.out.println(arrayList);

        for (String cars:arrayList
             ) {
            System.out.println(cars);

        }

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
