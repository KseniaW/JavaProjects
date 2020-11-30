package com.syntax1.class11;

public class Parent extends GrandParents {
    Parent(){
        System.out.println("Cons from Parent");
    }
    Parent(int money){
        super(money);
    }
}
