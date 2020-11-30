package com.syntax1.class03int;

public class Main {
    static int Sum1(int[] array) {
        int sum = 0;
        for (int i=0; i< array.length; i++) {
            if(array[i]%2==0)
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Main m = new Main();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Sum1(array));

        Main m1=new Main();
        int[] array1 ={1,2,3,4,5,6,7,8};
        System.out.println(Sum1(array1));
    }
}
