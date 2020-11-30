package com.syntax1.class19;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(15.00);
        doubleArrayList.add(150.65);
        doubleArrayList.add(2.99);
       // doubleArrayList.add(25.07);
//if even number no error, if uneven error
        Iterator<Double> iterator = doubleArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(iterator.next());

        }


    }
}