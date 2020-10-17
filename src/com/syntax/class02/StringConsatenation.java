package com.syntax.class02;

public class StringConsatenation {
	public static void main (String[] args) {
		
		
		String name="Olga";
		//I would like to say: My name is Olga
		
		System.out.println("My name is "+name);
		
		String lastName="Sorrels";
		
		//I would like to print Olga Sorrels
		
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		//Olga lives in Miami
		
		System.out.println(name+" "+"lives in"+" "+city);
		
		char grade='B';
		
		//Olga is B student
		
		System.out.println(name+ " is "+grade+" student");
		
		//Olga is 21 years old
		
		byte age=21;
		System.out.println(name+ " is "+age+ " years old");
		//to attach/consatenate any value (char,int,string...)
		//to a string we use + (string consatenantion operator)
		
		int date=27;
	String month="September";
	
	System.out.println(date+ " " +month);
		
		String state="DC";
		String anotherState="   DC ";
		//above Strings are not equal,
		//state has 2 characters and anotherState has 3 characters
		
		System.out.println(state);
		System.out.println(anotherState);
		
		
	}
}
