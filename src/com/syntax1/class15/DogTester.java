package com.syntax1.class15;

public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog();//4methods
     dog.appearance();
     dog.bark();
     dog.eat();
     dog.sleep();

     dog=new Chow();//still 4 methods but existed in chow will be overridden
     dog.appearance();
     dog.sleep();

     Chow chow=(Chow)dog;
     //now everything of both parent and child stored

    }
}