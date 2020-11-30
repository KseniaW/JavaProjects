package com.syntax1.class19;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HW5 {
    /*
    Create a Set of cities in which you want to make
    sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Moscow");
        linkedHashSet.add("Washington");
        linkedHashSet.add("Ankara");
        linkedHashSet.add("Virginia Beach");
        linkedHashSet.add("New York");

        System.out.println(linkedHashSet);

        Iterator<String>iterator=linkedHashSet.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();

            }
        }
        System.out.println(linkedHashSet);

    }
}