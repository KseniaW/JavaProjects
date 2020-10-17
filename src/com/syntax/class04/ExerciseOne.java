package com.syntax.class04;

public class ExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean diploma = true;
		double gpaScore = 3.1;

		if (diploma == true) {
			System.out.println("Congratulations");
			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Get a degree");
		}

	}
}
