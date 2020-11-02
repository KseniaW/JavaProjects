package com.syntax.class11;

import java.util.Scanner;

public class Task5Repl {

	public static void main(String[] args) {
		/*
Write a program that creates a String array with size 7. 
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array

Example:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday etc
		
		 */
		
		 Scanner scan=new Scanner(System.in);
		 
		    String[] days={"a","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		      for(int i=0; i<7; i++){
		       System.out.println("Please enter day "+ (i+1)+" of the week");
		     
		       days[i]=scan.nextLine();
		    
		    
		      }for(int i=0;i<7;i++) {
		    	  System.out.println(days[i]);
		      }
		

	}

}
