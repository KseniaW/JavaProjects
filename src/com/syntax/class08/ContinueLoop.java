package com.syntax.class08;

public class ContinueLoop {

	public static void main(String[] args) {
		// print numbers 1 to 5 except 3
		
		for(int i=1; i<=5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}

	}

}
