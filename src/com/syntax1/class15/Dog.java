package com.syntax1.class15;

public class Dog {
    void bark(){
        System.out.println("Dog is barking");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
    void eat(){
        System.out.println("Dog is Eating");
    }
    void appearance(){

    }
}
class Cockapoo extends Dog{
    void appearance(){
        System.out.println("long hair");
    }
    void sleep(){
        System.out.println("sleep 16 hours a day");
    }

}
class Chow extends Dog{
    void appearance(){
        System.out.println("sharp teeth");
    }
    void special(){
        System.out.println("I love kids");
    }
    void hunt(){
        System.out.println("Hunt Squarrels");
    }
}
