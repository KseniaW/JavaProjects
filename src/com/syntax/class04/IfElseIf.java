package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we need to compare 2 numbers
		// bigger, smaller or equal

		int num1 = 19;
		int num2 = 19;

		if (num1 > num2) {// what is this condition is true
			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 < num2) {// or what if this is true
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		// based on the day of the week we will print class schedule
		int day = 4;
		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we have manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we have manul class again");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we have Review class");

		} else if (day == 5) {
			System.out.println("Today is Friday and I dont have a class");
		} else if (day == 6) {
			System.out.println("Today is Saturday, we have a Java class");
		} else if (day == 7) {
			System.out.println("Today is Sunday and i did a lot of coding");
		} else {
			System.out.println("This is invalid day of a week");
		}

	}

}
