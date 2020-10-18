package com.syntax.class08;

import java.util.Scanner;

public class LoopsExample {

	public static void main(String[] args) {
		// ask user to pay for water $5, we tell if need more or less
		
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for water");
money=input.nextInt();


while(money!=waterPrice) {
	if(money>waterPrice) {
		System.out.println("This is too much");
	}else {
		System.out.println("Give more money");
	}
}
System.out.println("Enjoy your water");
	}

}
