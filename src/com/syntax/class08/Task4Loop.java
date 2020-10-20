package com.syntax.class08;

public class Task4Loop {

	public static void main(String[] args) {
	//multiplication table
		int num1=1;
		int mult;
		
		for(int i=1; i<=10; i++) {
			mult=num1*i;
			System.out.println(num1+"x"+i+" = "+mult);
		}
}
}