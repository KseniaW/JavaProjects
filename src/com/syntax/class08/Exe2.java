package com.syntax.class08;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner scan;
		String answer;
	scan=new Scanner(System.in);
		
		do{
			System.out.println("Apply for credit card");
			answer=scan.next();
		}  while(!answer.equalsIgnoreCase("yes"));
System.out.println("You got it");

	
}
	
	}


