package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {

		// variable for allergy -yes or no
		// if allergy is yes->
		// we will check pet allergy
		// peanut allergy
		// pollen allergy
		// if no allergy you are lucky

		boolean allergy = true;

		boolean peanutAllergy = true;
		boolean petAllergy = false;
		boolean pollenAllergy = false;

		if (allergy) {
			System.out.println("Lets do further check");

			if (petAllergy) {
				System.out.println("Please no home pets");
			} else {
				System.out.println("That is good you do not have pet allergy");
			}

		} else {
			System.out.println("You are lucky");
		}
	}
}
