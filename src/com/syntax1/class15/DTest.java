package com.syntax1.class15;

public class DTest {
    public static void main(String[] args) {
        DaniloParents daniloParents = new Danilo();

        DaniloParents[] familyArray = new DaniloParents[3];
        familyArray[0] = new Danilo();
        familyArray[1] = new Jelena();
        familyArray[2] = new Milos();

        for (DaniloParents dp : familyArray) {
            dp.eat();
            dp.sleep();

        }
    }
    public static void print(Danilo danilo, Jelena jelena, Milos milos){

    }

}
