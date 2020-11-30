package com.syntax1.class11;

public class GrandParents {
    int money;
    GrandParents(){
        System.out.println("Const from GP");
    }
    GrandParents(int money){
        this.money=money;
        System.out.println("initialize money");

    }
    void print(){
        System.out.println("I have money"+ money);
    }
}
