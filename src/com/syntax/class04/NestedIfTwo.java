package com.syntax.class04;

public class NestedIfTwo {

	public static void main(String[] args) {
		/*
		 * check if assignment is completed if assignment is completed: if score
		 * >90=great job if score>80=good job if score>70=please study more
		 */

		boolean done = true;
		int score = 59;

		if (done) {

			if (score > 90) {
				System.out.println("You did great!!!");
			} else if (score > 80) {
				System.out.println("You did good!");
			} else if (score > 70) {
				System.out.println("You need to study more");
			} else {
				System.out.println("Good for trying but study more");
			}

		} else {
			System.out.println("You should complete all tasks");
		}
	}

}
