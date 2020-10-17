package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
//shortcut to import ctrl+shift+o
	public static void main(String[] args) {
		int num=80;
		String str="I am a string";
		
		Scanner scan=new Scanner(System.in);//enable input to console
		//im addidng message to a user
		System.out.println("Please enter any text");
		String value=scan.nextLine();//waits for your input and once you provided input->press Enter
System.out.println("I captured value ="+value);
System.out.println("Please enter you name");
String name=scan.nextLine();
System.out.println("Nice to meet you " +name);
	}

}
