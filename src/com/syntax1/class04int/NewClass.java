package com.syntax1.class04int;

import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
        //reverse a string character by character
        String str1="Anna";
        String rev="";
        for (int i = str1.length()-1; i >=0 ; i--) {
            rev+=str1.charAt(i);
        }
        System.out.println(rev);
        System.out.println("Is "+str1+ " palidrome? "+ rev.equalsIgnoreCase(str1));

        StringBuilder stringBuilder=new StringBuilder("Anna");
        System.out.println(stringBuilder.reverse());




    }
}
