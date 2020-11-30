package com.syntax1.class19;

import java.util.ArrayList;
import java.util.List;

public class HW3 {
    /*
    How can you remove all duplicates from ArrayList?
List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
     */
    public static void main(String[] args) {
        ArrayList<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        ArrayList<String>newList=new ArrayList<>();
        for (String a:aList) {
           if(!newList.contains(a)){
               newList.add(a);

           }

        }
        System.out.println(newList);

    }
}
