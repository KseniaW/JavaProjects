package com.syntax1.class16;

public class MethodExample2 {
    public static void main(String[] args) {
        PrintNTime("Please study",10);

    }
    static void PrintNTime(String word, int times){
        for(int i=0; i<times; i++){
            System.out.println(word);
        }
            }
}
