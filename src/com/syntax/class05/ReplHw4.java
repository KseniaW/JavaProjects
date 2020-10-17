package com.syntax.class05;

import java.util.Scanner;

public class ReplHw4 {

	public static void main(String[] args) {
	/*
	 * Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"
	 */
		Scanner scan;
		boolean isWeekend;
		String subject;
		
		scan=new Scanner(System.in);
		System.out.println("Is it weekend?");
		isWeekend=scan.nextBoolean();
		
		if(! isWeekend) {
			subject="Manual testing";
		}else {
			subject="Java";
		}
		System.out.println("Today you will be learning "+subject);
		
	

}
}