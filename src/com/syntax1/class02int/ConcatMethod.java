package com.syntax1.class02int;

public class ConcatMethod {
    public static void main(String[] args) {
        String firstName="Ebrar";
        String lastName=" Gur";
        String name="Burju Kaya";
        String name2=null;

        String completeName=firstName.concat(name2);

        System.out.println(completeName);
//you can add only one
        System.out.println(firstName+lastName+name2);
        //you can add as many

    }
}
