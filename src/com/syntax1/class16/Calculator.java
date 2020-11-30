package com.syntax1.class16;

public class Calculator {
    int num;
    Calculator(int num){
        this.num = num;

    }
    int add(int num){
       return this.num=this.num+num;
    }
    int sub(int num){
        return this.num=this.num-num;
    }
    void printNumber(){
        System.out.println("Results "+num);
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator(15);
        calculator.add(10);
        calculator.printNumber();
        calculator.sub(100);
        calculator.printNumber();
    }
}
