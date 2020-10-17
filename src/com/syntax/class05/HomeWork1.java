package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double num1,num2,num3;
	System.out.println("Enter 3 double values");	
		num1=s.nextDouble();
		num2=s.nextDouble();
		num3=s.nextDouble();
		
		if(num1>num2&&num1>num3) {
			System.out.println(num1+" is the largest");
		}else if(num2>num1&&num2>num3) {
			System.out.println(num2+" is the largest");
		}else if(num3>num1&&num3>num2) {
			System.out.println(num3+" is the largest");
		}
		
		

	}

}
