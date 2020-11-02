package com.syntax.class11;

public class Task8 {
    public static void main(String[] args) {
        //2d array, sum of all odd numbers
        int [][] number={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum=0;
        for (int[] original:number){
            for(int orig:original){
                System.out.print(orig+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < number.length ; i++) {
            for (int j = 0; j < number[i].length ; j++) {
                if((number[i][j]%2)!=0){
                    System.out.print(number[i][j]+" ");
                    sum=sum+number[i][j];
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
