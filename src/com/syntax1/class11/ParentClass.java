package com.syntax1.class11;

public class ParentClass {
    int money;
    ParentClass(int money){
        this.money=money;
        System.out.println("From Parent");
    }


    void marry(){
        System.out.println("we select Lisa "+money);
    }
}
