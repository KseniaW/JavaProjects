package com.syntax.class03;

public class AdditionsVsConsatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		
		String c="Hello";
		String d="Friends";
		
		System.out.println(a+b+c+d);
		System.out.println(a+c+b+d);
		System.out.println(c+d+a+b);
		System.out.println(c+d+(a+b));
	}

}
