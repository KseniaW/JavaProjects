package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3;




		for (int i = 1; i <= 10; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			System.out.print(n1+" ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

	}

}
