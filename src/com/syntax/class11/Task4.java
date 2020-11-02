package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {

		int[] myArray = new int[]{66, 45, 65, 32, 876, 900};

		int max = myArray[0];
		int min = myArray[0];

		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
			if (min > myArray[i]) {
				min = myArray[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}