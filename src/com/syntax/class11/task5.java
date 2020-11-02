package com.syntax.class11;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
//second largest number
       int[] num1={1,5,3,6};
        int length= num1.length;
        Arrays.sort(num1);
        System.out.println(num1[length-2]);
      //without sorting
        int[] myArray={66,45,65,965,32,876,900};
        int max=myArray[0];

        int secondmax=0;
        for(int i=0; i< myArray.length; i++){
            if(myArray[i]>max){
                secondmax=max;
                max=myArray[i];
            }else if(myArray[i]>secondmax&& myArray[i]!=max){
                secondmax=myArray[i];
            }
        }

        System.out.println(max);
        System.out.println(secondmax);

    }
    }

