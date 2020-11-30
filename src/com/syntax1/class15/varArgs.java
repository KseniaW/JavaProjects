package com.syntax1.class15;

public class varArgs {
    void print(int ...a){ //same as array
        for(int numberInArray:a){
            System.out.println(numberInArray);
        }
    }

    public static void main(String[] args) {
        varArgs varArgs=new varArgs();
        varArgs.print(1,5,67);
    }
}
