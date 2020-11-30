package com.syntax1.class04int;

public class Task1A {
    public static void printLarger(double num1, double num2){
        if(num1>num2){
            System.out.println(num1+" is larger");
        }else if(num2>num1){
            System.out.println(num2+" is larger");
        }else {
            System.out.println("numbers are equal");
        }
    }
}
