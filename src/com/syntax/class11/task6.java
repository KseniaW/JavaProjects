package com.syntax.class11;

public class task6 {
    public static void main(String[] args) {
        //2d array 3 rows and 3 columns, print the sum
int [][] array = {
            {39,78,3},
            {10,57,80},
            {61,33,90}
        };
int sum=0;
for (int i=0; i< array.length; i++){
    for (int j=0; j<array[i].length; j++){

        sum+=array[i][j];

        }
    }
        System.out.println(sum);
}


    }

