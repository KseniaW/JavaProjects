package com.syntax1.class06int;

public class Task3 {
    private static String VowelsOnly(String name){
        return name.replaceAll("[^AaEeUuIiOo]","");

    }

    public static void main(String[] args) {

        System.out.println(VowelsOnly("all vowels removed"));
    }


    }

