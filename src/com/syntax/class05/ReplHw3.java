package com.syntax.class05;

import java.util.Scanner;

public class ReplHw3 {

	public static void main(String[] args) {
		/*
		 * Take 2 boolean inputs from a user:
 
"Are you thirsty?"
"Are you sleepy?"

If user is thirsty and not sleepy--> drink=Water
If user is thirsty and sleepy--> drink=Coffee
If user is not thirsty and sleepy --> drink=Tea
Otherwise drink="Nothing"
		 */
	
	Scanner scan;
	scan=new Scanner(System.in);
	boolean isThirsty, isSleepy;
	String drink=null;
	System.out.println("Are you thirsty");
	isThirsty=scan.nextBoolean();
	System.out.println("Are you sleepy");
	isSleepy=scan.nextBoolean();
	
	if(isThirsty && !isSleepy) {
		drink="Water";
	}else if(isThirsty && isSleepy) {
		drink="Coffee";
	}else if(!isThirsty&& isSleepy) {
		drink="Tea";
	}else {
		drink="Nothing";
	}
	System.out.println("Looks like you need to drink "+drink);
	
	
	
	
	
	
	}

}
