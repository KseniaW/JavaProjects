package com.syntax1.class16;

public abstract class Phone {
    public void makeCalls(){
        System.out.println("Phone makes calls");
    }
    public void sendText(){
        System.out.println("Phones send txt");
    }

    public abstract void viewPicture();
    public abstract void unlock();
}
abstract class Iphone extends Phone {

    @Override
    public void viewPicture() {
        System.out.println("We can check the photos ");
    }
}
class IphoneChild extends Iphone{
    @Override
    public void unlock() {
       System.out.println("we can unlock with face");

    }
}

class Samsung extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("View pics with gallery");
    }

    @Override
    public void unlock() {
        System.out.println("unlock using the password");
    }
}
