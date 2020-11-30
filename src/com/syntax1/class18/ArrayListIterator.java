package com.syntax1.class18;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Ksenia");
        arrayList.add("Davit");
        arrayList.add("Mike");
        arrayList.add("Burju");
        arrayList.add("Asghar");

        System.out.println("Using enhansed for loop");
        for (String name:arrayList
             ) {
            System.out.println(name);

        }
        System.out.println("=======================");
        System.out.println("using normal loop");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
            System.out.println("=====================");
            System.out.println("Using while loop");
            int index=0;
            while(index<arrayList.size()){
                System.out.println(arrayList.get(index));
                index++;

            }
            System.out.println("=================");
            System.out.println("Using iterator");
            Iterator<String>iterator=arrayList.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }

