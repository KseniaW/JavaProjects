package com.syntax1.class01int;

public class Cat {
    String color;
    String size;
    int age;
    String name;

    void meow() {
        System.out.println("Cat meows");
    }


    public static void main(String[] args) {
        Cat c=new Cat();
        c.age=12;
        c.color="brown";
        c.name="Milo";
        c.size="big";
        c.meow();

    }
}