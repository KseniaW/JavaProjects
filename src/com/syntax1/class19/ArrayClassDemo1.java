package com.syntax1.class19;

import java.util.ArrayList;

public class ArrayClassDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(15.00);
        System.out.println(doubleArrayList);
        //replaces the value at specified index with set method
        doubleArrayList.set(1,20.25);
        System.out.println("After replacement");
        System.out.println(doubleArrayList);
        doubleArrayList.remove(0);
        System.out.println("After removing");
        System.out.println(doubleArrayList);
//print numbers of array
        System.out.println("Print numbers from top");
        for (Double singleNum:doubleArrayList
             ) {
            System.out.println(singleNum);

        }
        System.out.println("Reverse order");
        for (int i = doubleArrayList.size()-1; i >=0 ; i--) {
            System.out.println(doubleArrayList.get(i));
        }


    }
}
