package com.syntax.class03;

public class RelationalAndEqualityOperators {

	public static void main(String[] args) {
		// >, >=,<, <=, ==, != (not equal)
		
		int a=10;
		int b=15;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		int x=100;
		int y=90;
		boolean result=x>y;
		
		result=x==y;
		System.out.println(result);
		
		
		System.out.println(x==y);//compare
		System.out.println(x=y);//assigning value of y to variable x
		System.out.println(x);//90
		
		boolean result1=x==y;
		System.out.println(result1);
		
		byte num=10;
		byte num1=10;
		
		boolean boo=num>=num1;//false
		System.out.println(boo);
		
		
		
		
		
		
		
		
		
		
	}

}
