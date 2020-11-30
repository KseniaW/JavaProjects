package com.syntax1.class09int;

public class NewClass {

    int integerValue;
    String stringValue;
    double doubleValue;
    boolean booleanValue;
    float floatValue;

    void print(){
        System.out.println(integerValue);
        System.out.println(stringValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(floatValue);

    }
    public static void main(String[] args){
       NewClass m=new NewClass();
        m.print();
    }
}