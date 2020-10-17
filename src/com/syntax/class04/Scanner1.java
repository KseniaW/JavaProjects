package com.syntax.class04;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");
        boolean rain=input.nextBoolean();
        if(rain) {
        	System.out.println("Take an umbrella");
        }else {
        	System.out.println("Go for a walk");
        }
        
		System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println(age);

        
        System.out.println("Please enter your name");
        String name=input.next();
        
        System.out.println("Your name is "+name+" you are "+age+" years old");
	}

}
