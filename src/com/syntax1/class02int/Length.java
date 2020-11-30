package com.syntax1.class02int;

public class Length {
    public static void main(String[] args) {
        String name="Qasim";
        System.out.println(name.length());
        name="";
        System.out.println(name.length());
        name="Ahmed Qasim";
        System.out.println(name.length());
        name="  Qasim   ";
        System.out.println(name.length());
        //everything in the quotes counts

        if(name.length()>10){
            System.out.println("you are great");
        }

    }
}
