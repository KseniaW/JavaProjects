package com.syntax1.class09int;

public class Dog {
    String dogName;
    int x;
    double dogWeight;
    String dogBreed;

    public Dog() {
        x = 5;  // Set the initial value for the class attribute x
    }
    Dog(String dogName, String dogBreed, double dogWeight){
        this.dogName=dogName;
        this.dogBreed=dogBreed;
        this.dogWeight=dogWeight;
    }

    void printInfo(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }

}

