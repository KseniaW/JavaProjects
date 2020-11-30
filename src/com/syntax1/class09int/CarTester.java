package com.syntax1.class09int;

public class CarTester {
    public static void main(String[] args) {


        Car c1 = new Car("Toyota", "Prius", 4, 120, 30000.0);
        c1.displayInfo();
        Car c2 = new Car("Toyota", "Prius", 120, 30000.0);
       c2.displayInfo();
        Car c3 = new Car(4, 120, 30000.0);
        c3.displayInfo();
        Car c4 = new Car("Toyota", "Prius", 4);
    c4.displayInfo();
    }
}