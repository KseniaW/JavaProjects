package com.syntax1.class19;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayClassDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(15.00);
        doubleArrayList.add(150.65);
        doubleArrayList.add(2.99);
        doubleArrayList.add(25.07);
        System.out.println("before removing");
        System.out.println(doubleArrayList);
       // for (Double element:doubleArrayList
        //     ) {
         // if(element<20){
           //  doubleArrayList.remove(element);
        //  }

      // }
        //Runtime exception cuz we re trying to perform 2 operations

//Unexpected results or run time
        //for (int i = 0; i < doubleArrayList.size(); i++) {
           // if(doubleArrayList.get(i)<20.0){
            //  doubleArrayList.remove(doubleArrayList.get(i));
            //    }
           // }

        Iterator<Double>iterator =doubleArrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next()<20){
                iterator.remove();
            }
        }
        System.out.println("after removing");
      System.out.println(doubleArrayList);

        Iterator<Double>iterator1 =doubleArrayList.iterator();
        System.out.println(iterator1.next());
    }
}
