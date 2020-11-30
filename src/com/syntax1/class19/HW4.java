package com.syntax1.class19;

import java.util.Iterator;
import java.util.TreeSet;

public class HW4 {
    /*
    Create a Set collection in which you need to add names
    of the countries. In this set we want all objects to be sorted
    in alphabetical order. Using 2 different ways retrieve
    all elements from set.
     */
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("Russia");
        countries.add("Turkey");
        countries.add("Japan");
        countries.add("Colombia");
        countries.add("China");
        countries.add("Brazil");

        System.out.println(countries);

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

    }
}