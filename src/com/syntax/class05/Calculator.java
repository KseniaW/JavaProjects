package com.syntax.class05;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prompt user to enter 2 numbers
		// ask for the operator
		// display result
		
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter 2 numbers");
				double num1 = input.nextDouble();
				double num2 = input.nextDouble();
				System.out.println("Please enter the mathematical operator you want to use");
				char operator = input.next().charAt(0);
				double result = 0;
				switch (operator) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				case '%':
					result = num1 % num2;
					break;
				default:
					System.out.println("please enter a valid mathematical operator");
					break;}
				if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
					System.out.println("The result of " + num1 + " " + operator + " " + num2 + " = " + result);}
			}
		


	}


