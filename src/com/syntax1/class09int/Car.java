package com.syntax1.class09int;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    Car(String make, String model, int topSpeed, double price) {
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;
        numberOfDoors = 4;
    }

    Car(int numberOfDoors, int topSpeed, double price) {
        make = "unknown";
        model = "unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    Car(String make, String model, int numberOfDoors) {
        topSpeed = 90;
        price = 0;
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
    }

    void displayInfo() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);

    }


}

