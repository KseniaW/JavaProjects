package com.syntax1.class16;

import com.syntax1.class12.MethodOverLoading;

public class Methods {
    public static void main(String[] args) {
        String name = "Jack Plantin";
        //built inwe cant modify them
        System.out.println(name.length());
        Methods methods=new Methods();
        methods.getAndPrintLength("Jack");
        //non static method call
        //if we dont write a emthod we have to repeat code
        String name1="Bryan Gal";
        String name2="Aladdin";
        String name3="general abdul rashid custom aladin";
    }

    public int getAndPrintLength(String name) {
        int length=name.length();
if(name.length()>15){
    System.out.println("name too long");
}else{
    System.out.println("good to go");
}
return length;
    }
}