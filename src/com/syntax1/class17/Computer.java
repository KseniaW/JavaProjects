package com.syntax1.class17;

class SmartMachine{
    public void smart(){
        System.out.println("I am a smart machine");
    }
}
class Computer extends SmartMachine {
    String brand;

    Computer(String brand) {
        this.brand = brand; //using this to differenciate between
        //local and instance variable
    }

    public void run() {
        System.out.println(brand + " can run");
    }

    public void transfer() {
        System.out.println(brand + " can transfer data");
    }

    public void storage() {
        System.out.println(brand + " can store data");
    }
}

class HP extends Computer{
    public HP(String brand) {
        super(brand);
    }
    public void secure(){
        System.out.println(brand+" can be unlocked with fingers");
    }
}



    class Apple extends Computer {
        public Apple(String brand) {
            super(brand);
        }

        @Override
        public void run() {
            System.out.println("Runs faster");
        }

        @Override
        public void storage() {
            System.out.println("saves data in different way");
        }

        @Override
        public void transfer() {
            super.transfer();
        }
    }

    class Lenovo extends Computer{

        public Lenovo(String brand) {
            super(brand);
        }
        void tabletMode(){
            System.out.println(brand+" can be used as a tablet");
        }
    }


