package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		Scanner scan;
		boolean answer;
		double balance;
		scan = new Scanner(System.in);
		System.out.println("please enter if you have a cc(true/false)");

		answer = scan.nextBoolean();
		if (answer) {
			System.out.println("Whats the balance?");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("please pay off");
			} else {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("Would you like a crdit card?");
		}

	}

}
