package com.syntax.class09;

public class ArrayPractice {

	public static void main(String[] args) {
		//5 students in class to calculate the average
int[]grades=new int[5];

grades[0]=98;
grades[1]=80;
grades[2]=89;
grades[3]=67;
grades[4]=77;

double average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
	System.out.println(average);
	
	int a=10;
	int b;
	double[] array;
	array=new double[3];
	array[0]=12.99;
	array[1]=10.99;
	
	System.out.println(array[2]);
	}

}
