package com.syntax.class05;

import java.util.Scanner;

public class NewInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter height in inches");
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		
		
		if (height>0 && height < 60) {
			System.out.println("short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("medium");
		} else if (height > 72) {
			System.out.println("tall");
		} else
			System.out.println("Enter valid height");
	}
}