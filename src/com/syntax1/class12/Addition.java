package com.syntax1.class12;

public class Addition {
    int sum(int num1, int num2) {
        return num1 + num2;
    }

    int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    int sum(int[] numArray){
        int sum=0;
        for(int num:numArray){
            sum=sum+num;
        }
        return sum;
    }
}
