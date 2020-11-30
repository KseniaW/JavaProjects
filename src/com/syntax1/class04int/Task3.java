package com.syntax1.class04int;

public class Task3 {
    //hello is different languages

    static void sayHello(String countryName){
switch(countryName){
    case"USA":
        System.out.println("Hello");
        break;
    case"Spain":
        System.out.println("Hola");
        break;
    case"Turkey":
        System.out.println("Merhaba");
        break;
    default:
        System.out.println("Country not supported");
}
    }

    public static void main(String[] args) {
        sayHello("USA");

    }
}
