package com.syntax1.class05int;

public class ClassB {

    boolean isPrime(int number){
boolean isPrime=true;
        for (int i = 2; i <number/2 ; i++) {
            if(number%i==0){
                isPrime=false;
                break;
            }

        }
        return isPrime;
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        boolean prime=classB.isPrime(25);
        System.out.println(prime);
    }
}
