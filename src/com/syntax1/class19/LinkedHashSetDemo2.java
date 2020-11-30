package com.syntax1.class19;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

//order is not guaranteed, only 1 apple if there are 2(no duplicates)
        linkedHashSet.add(2);
        linkedHashSet.add(13);
        linkedHashSet.add(15);
        linkedHashSet.add(-7);
        linkedHashSet.add(2);
        linkedHashSet.add(20);
        linkedHashSet.add(100);
        System.out.println(linkedHashSet);
    }
}