package com.syntax1.class04int;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        //reverse word by word

        String str="What did you use the most?";
        String[] StringArray=str.split(" ");
        System.out.println(Arrays.toString(StringArray));

        for (int i = 0; i <StringArray.length; i++) {
StringBuilder stringBuilder=new StringBuilder(StringArray[i]);
            StringArray[i]=stringBuilder.reverse().toString();


        }
        System.out.println(Arrays.toString(StringArray));
    }
}
