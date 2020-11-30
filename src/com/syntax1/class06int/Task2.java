package com.syntax1.class06int;

public class Task2 {
    public static String reverseString(String string){
        StringBuilder stringBuilder=new StringBuilder(string);
        return stringBuilder.reverse().toString();

    }
}
