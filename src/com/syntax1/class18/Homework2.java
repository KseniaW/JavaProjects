package com.syntax1.class18;

import java.util.ArrayList;
import java.util.Collections;

public class Homework2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Tequila");
        arrayList.add("Tea");
        arrayList.add("Coffee");
        arrayList.add("Mojito");
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).contains("a")|| arrayList.get(i).contains("e")){
                arrayList.set(i,"water");
            }


        }
        System.out.println(arrayList);

        }
        }


