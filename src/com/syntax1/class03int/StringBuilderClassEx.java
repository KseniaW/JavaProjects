package com.syntax1.class03int;

public class StringBuilderClassEx {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("Hello");
        stringBuilder.append(" world");
        String str="hello";
        str.concat("world");
        System.out.println(str);
        System.out.println(stringBuilder);
    }
}
