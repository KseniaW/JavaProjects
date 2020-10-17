package com.syntax.class05;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter quiz score");
		int quiz = scan.nextInt();
		System.out.println("enter mid term score");
		int midTerm = scan.nextInt();
		System.out.println("enter final score");
		int finalScore = scan.nextInt();

		int averageScore = quiz + midTerm + finalScore;
		System.out.println("average score is " + averageScore);

		if (averageScore >= 90) {
			System.out.println("grade A");
		} else if (averageScore >= 70 && averageScore < 90) {
			System.out.println("grade B");
		} else if (averageScore >= 50 && averageScore < 70) {
			System.out.println("grade c");
		} else if (averageScore < 50) {
			System.out.println("grade f");
		} else
			System.out.println("Invalid grade");

	}

}
