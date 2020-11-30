package com.syntax1.class03int;

public class SubString {
    public static void main(String[] args) {

        String name= "yes always";
        System.out.println(name.substring(2));
        //first 2 charachters get ignored

        System.out.println(name.substring(2,6));
        System.out.println(name.substring(1,3)+" "+name.substring(2,6));
    }
}
