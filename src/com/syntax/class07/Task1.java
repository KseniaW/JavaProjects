package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		boolean workDay = true;
		int day = 1;

		while (workDay) {

			if (day < 6) {
				System.out.println("I need a day off");

			} else {
				System.out.println("I dont need a day off");
			workDay=false;
			}
			
			day++;
		}
	}
}
