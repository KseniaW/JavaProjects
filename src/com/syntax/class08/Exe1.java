package com.syntax.class08;

public class Exe1 {

	public static void main(String[] args) {
		// numbers from 1 to 50 except that are /3
		
		for(int a=1; a<=50; a++) {
			if(a%3==0) {
				continue;
				
			}
			System.out.println(a);
		}

	}

}
