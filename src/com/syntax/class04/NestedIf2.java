package com.syntax.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		/*
		 * if today is Friday we will watch movie but would
		 * like to check the date
		 * if date is 13-> we watch scary movie
		 * if not-> we will watch comedy
		 * if its not Friday-> Im studying
		 */
		
		boolean isFriday=true;
		int date=4;
		boolean Monday=true;
		
		if (isFriday) {
	      if(date==13) {
	    	  System.out.println("I will watch scary movie");
	      }else {
	    	  System.out.println("I will watch a comedy");
	      }
			
		}else {
			if (Monday) {
				System.out.println("Im not studying,im working");
			}else {
				System.out.println("I have a class");
			}
		}

		
		
	}

}
