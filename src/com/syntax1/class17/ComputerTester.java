package com.syntax1.class17;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] allComputersInSingleVar ={new Apple("Apple"),
                new Lenovo("Lenovo"),new HP("HP")};
    for(Computer computer:allComputersInSingleVar){
        computer.run();
        computer.storage();
        computer.transfer();

    }
    }
}