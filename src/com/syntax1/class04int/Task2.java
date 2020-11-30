package com.syntax1.class04int;

public class Task2 {
    //odd or even number
    //Even completely divisible by 2;
    //are not divisible by 2--> odd
    void printNumberEvenOrOdd(int number){
        if(number%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }


    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.printNumberEvenOrOdd(5);
    }
}
