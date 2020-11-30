package com.syntax1.class16;

public abstract class Vehicle {
    String color;
    static int totalVehicles;
    Vehicle(){
       System.out.println("i will be called when an obj of child class is created using no arg");
    }
    Vehicle(String color){
        this.color=color;
        System.out.println("i will be called when an obj of child class is created using no arg");
    }
    public void drive(){
        System.out.println("Vehicle drives");
    }
    public void stop(){
        System.out.println("vehicle stops");
    }
    public abstract void start();
    public abstract void Break();

}//can have only one public class
abstract class Car extends Vehicle{
    String carType;
    Car(String color, String carType){
        super(color);
        this.carType=carType;
    }

    @Override
    public void Break() {
        System.out.println("have breaks");
    }
}

class Tesla extends Car{
String make;
    Tesla(String color, String carType, String make) {
        super(color, carType);
        this.make=make;
    }

    @Override
    public void start() {

    }

}
