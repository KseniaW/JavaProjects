package com.syntax.class07;

import java.util.Scanner;

public class DoWhileVsWhile {

	public static void main(String[] args) {
// lottery enter 1 to 100, one number is winning
// lucky number is 7
//keep asking a number until a lucky number
		
	Scanner scan;
	int numberFromUser;
	int luckyNumber=7;
	
	scan=new Scanner(System.in);
	do {
		System.out.println("Please number 1 to 100");
		numberFromUser=scan.nextInt();
	}while(numberFromUser!=luckyNumber);
	System.out.println("You got it");
		
		

	}

}
