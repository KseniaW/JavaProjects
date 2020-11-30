package com.syntax1.class03int;

public class replaceAll {
    public static void main(String[] args) {
        String mix="3213Hello 89 World354545 *&&*** ";
        System.out.println(mix.replaceAll("[8-9]",""));
        System.out.println(mix.replaceAll("[a-z]",""));
        System.out.println(mix.replaceAll("[a-z A-Z]",""));
        System.out.println(mix.replaceAll("[^A-Za-z8-9]",""));

    }
}
