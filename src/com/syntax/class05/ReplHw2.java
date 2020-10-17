package com.syntax.class05;

import java.util.Scanner;

public class ReplHw2 {

	public static void main(String[] args) {
		/*
		 * Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
		 */
		 Scanner scan;
		 String word1, word2, output = null;
		  int num1,num2;
		  scan=new Scanner(System.in);
		
		System.out.println("Please enter two strings");
		  word1=scan.nextLine();
		  word2=scan.nextLine();
		  System.out.println("Please enter two numbers");
		  num1=scan.nextInt();
		  num2=scan.nextInt();
		
		   if(word1.equals(word2) && num1==num2) {
				  output="And";
		  } else if(word1.equals(word2) || num1==num2) {
			  output="Or";
		  } else if(!(word1.equals(word2) && num1==num2)) {
		  output="None";
			  
		  }
		  
		  
		System.out.println("Output: "+output);  
		  
		  
	}

}
