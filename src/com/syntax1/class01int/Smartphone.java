package com.syntax1.class01int;

public class Smartphone {
    String brand;
    String color;
    String model;

    void call(String phonenumber){
        System.out.println("Calling"+phonenumber);
    }
     void text(String text){
        System.out.println(brand+model+ "sending a text");

    }

    void pics() {
        System.out.println(brand+ " taking a picture");
    }

}

