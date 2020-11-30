package com.syntax1.class11;

public class MoneerClass extends ParentClass {
int money;

    MoneerClass(int money){
        super(money);

    }

   void marry(){
       super.marry();
       System.out.println("i will marry Katrina "+this.money);
    }

    public static void main(String[] args) {
        MoneerClass moneer=new MoneerClass(6);
        moneer.marry();

    }
}
