package com.syntax1.class17;

public class FinalMethodClass {
    final double PI=3.14;

    void calculateAreaOfCircle(double radius){
        System.out.println(PI*radius*radius);
    }
    double add(double num1, double num2){
        return num1+num2;
    }
    final public void printName(){
        System.out.println("hello");
    }
}
