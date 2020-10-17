package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberWithWhile {

	public static void main(String[] args) {
		Scanner scan;
		int numberFromUser;
		int LuckyNumber=7;
		
		scan=new Scanner(System.in);
		System.out.println("Enter any number 1 to 100");
numberFromUser=scan.nextInt();
		while(numberFromUser!=LuckyNumber) {
			System.out.println("Enter any number 1 to 100");
			numberFromUser=scan.nextInt();
		}System.out.println("Right number");
	}

}
