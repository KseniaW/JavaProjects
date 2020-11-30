package com.syntax1.class07int;

public class Task1 {
    int age;
    String name;
    char grade;

    Task1() {
        System.out.println("Called when no arguments");
    }

    Task1(int ageValue, String nameValue, char gradeValue) {
        System.out.println("3 Arguments");
        age=ageValue;
       name=nameValue;
       grade=gradeValue;
    }

    public static void main(String[] args) {

        Task1 t = new Task1(38,"Jack",'K');
   Task1 t1=new Task1();
    }
}