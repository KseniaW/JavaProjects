package com.syntax1.class08int;

public class Person {
    String name;
    String address;
    int age;
    String id;
    String phone;
    String SSN;
    char gender;
    char maritalStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;

    Person(){
        System.out.println("line 1");
        System.out.println("line 1");
        System.out.println("line 1");
        System.out.println("line 1");

    }
    Person(String name, int age,char maritalStatus){
        this();
        //you can use this instead of repeating a lot of lines of the same code
        this.name=name;
        this.age=age;
        this.maritalStatus=maritalStatus;
        this.weight=60;
        //once you initialize this one time then you can do
        //this(name,age)


    }




}
