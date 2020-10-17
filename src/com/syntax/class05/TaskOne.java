package com.syntax.class05;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int workedYears;
		int salary;

		Scanner s = new Scanner(System.in);
		System.out.println("enter number of worked years");
		workedYears = s.nextInt();
		

		if (workedYears>= 5) {
			System.out.println("eligible for the bonus");
			System.out.println("enter annual salary");
			salary = s.nextInt();
		 if (salary > 50000) {
				System.out.println("bonus is 5000");
			} else {
				System.out.println("bonus is 3000");
			}

		}else{
		System.out.println("Not eligible for bonus");
	}

}

}
