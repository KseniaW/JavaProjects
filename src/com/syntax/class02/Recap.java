package com.syntax.class02;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        byte smallnum=127;
		short midnum=100;
		int largenum=1000;
		long xlnum=100000;
		
		float var1=12.99f;
		double var2=9.99;
		
		boolean var3=true;
		boolean var4=false;
		
		char var5='C';
		
		
		
		System.out.println(smallnum);
		System.out.println(); // empty line
		System.out.println(largenum);
		System.out.println(xlnum);
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	
	//System.out.println(large);error, because code executes from top to 
	//bottom
		int large=10000;
		System.out.print(var2);
		
		//int 3=5 error saying duplicated variable
	}

}
