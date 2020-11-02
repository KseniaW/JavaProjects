package com.syntax.class09;

import java.util.Scanner;

public class ArraysExe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ask user how many names to store and store
		
		Scanner scan;
		String [] names;
		int size;
		
		scan=new Scanner(System.in);
		System.out.println("How many names");
		size= scan.nextInt();
		
		 names=new String[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter a name");
			names[i]=scan.next();
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] + " ");
		}
	}

}
