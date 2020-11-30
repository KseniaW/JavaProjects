package com.syntax1.class03int;

public class task11 {
    public static void main(String[] args) {
    String string="Strings";
        int length = string.length();
        if(!string.isEmpty()){
            if(length>=3 && length%2!=0){
                System.out.println(string.charAt(length/2));
            }

    }

    }
}
