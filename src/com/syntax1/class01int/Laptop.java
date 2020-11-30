package com.syntax1.class01int;

public class Laptop {
    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    //behaviors=methods
    void playMovies(){
        System.out.println("Playing movies");
    }
    void browseInternet(){
        System.out.println("Browsing Internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }
    public String getModel(){
        return model;
    }

    public int getRAMCapacity() {
        return RAMCapacity*2;
    }
    int upgradeRAM(int newRAMUnit){
        return newRAMUnit*RAMCapacity;
    }
}
