package com.syntax1.class19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String>hashSet=new HashSet<>();
        Set<String>linkedHashSet=new LinkedHashSet<>();
        Set<String>treeSet=new TreeSet<>();
//order is not guaranteed, only 1 apple if there are 2(no duplicates)
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("Strawberry");
        hashSet.add("Avocado");
        hashSet.add("Olives");
        System.out.println(hashSet);
    }
}
