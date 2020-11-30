package com.syntax1.class09int;

public class Main1 {
    static String alphabetical(String str){
        String newWord =""+ str.charAt(0);
        int i=1;
        while (i<str.length()){
            if (str.charAt(i) > str.charAt(i-1)){
                newWord+=str.charAt(i);
            }
            i++;
        }
        return newWord;
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}


