package com.syntax1.class08int;

public class Task {
    String name;
    int age;
    double salary;

   private Task(String name){
       //i can only create object from the same class
        this.name=name;
    }
    Task(int age){
        this.age=age;
    }

    public Task(double salary){
        this.salary=salary;
    }

    public static void main(String[] args) {
       // Task task=new Task();//Java wont create default if you pass values
        Task task=new Task("Marta");
        System.out.println(task.name);
        System.out.println(task.age);
        System.out.println(task.salary);

        Task task1=new Task(12);
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);

        Task task2=new Task(4.5);
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);
    }
}

