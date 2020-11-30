package com.syntax1.class17;

public abstract class Phone {
    public void call(){
        System.out.println("we can make calls");
    }
    public void text(){
        System.out.println("we can send txt");
    }
    public abstract void takePics();
    public abstract void playMusic();
}
class Iphone extends Phone{

    @Override
    public void takePics() {
        System.out.println("can take good pics in low light");

    }

    @Override
    public void playMusic() {
        System.out.println("can play music using AppStore");

        }
    }
