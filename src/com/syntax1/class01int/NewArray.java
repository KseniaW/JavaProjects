package com.syntax1.class01int;

public class NewArray {
    public static void main(String[] args) {
        //Write a program that creates an array of integers
        // that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
        //Print only values that stored with even index including 0.

    int[] array={45,78,12,67,55,89,23,77,88};
        for (int i = 0; i < array.length ; i++) {
            if (i%2==0){
                System.out.print(array[i]+" ");
            }
        }

    }
}
