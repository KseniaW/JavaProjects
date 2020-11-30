package com.syntax1.class19;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        for (int i = 0; i < 51; i+=2) {
            numbers.add(i);
        }
        System.out.println(numbers);

        Iterator<Integer>iterator= numbers.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }

        }
        System.out.println(numbers);
    }
}
