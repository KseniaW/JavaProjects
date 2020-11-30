package com.syntax1.class19;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Monrovia");
        cities.add("Brooklyn");
        cities.add("New York");
        cities.add("San Diego");
        System.out.println(cities);

        cities.addFirst("Istanbul");
        System.out.println(cities);

        cities.addLast("Moscow");
        System.out.println(cities);

        cities.add(3,"New Orleans");
        System.out.println(cities);
    }
}
