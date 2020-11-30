package com.syntax1.class11;

public class Davit extends Parent {
    Davit(){
        System.out.println("From Davit cons");
    }
Davit(int money){
        super(money);
    System.out.println("");
}
    public static void main(String[] args) {

        Davit davit= new Davit(100);
        davit.print();
    }

}
