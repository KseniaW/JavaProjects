package com.syntax1.class15;

public class DaniloFamilyTester {
    public static void main(String[] args) {
        DaniloParents daniloParents=new DaniloParents();
        daniloParents.eat();
        daniloParents.sleep();

        daniloParents=new Danilo();
        daniloParents.eat();
        daniloParents.sleep();
//same var
        daniloParents=new Jelena();//different object, diff behavior
        daniloParents.eat();
        daniloParents.sleep();
        //diff obj
        daniloParents=new Milos();
        daniloParents.sleep();
        daniloParents.eat();
        ((Milos) daniloParents).run(); //additional
        double var=10;
    }
}
