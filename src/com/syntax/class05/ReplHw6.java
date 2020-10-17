package com.syntax.class05;

import java.util.Scanner;

public class ReplHw6 {

	public static void main(String[] args) {
/*
 * A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade. 
 */
Scanner scan;
char grade=0;
int mark;
scan=new Scanner(System.in);

System.out.println("Please enter your mark");
mark=scan.nextInt();

if(mark>=1 && mark<25) {
	grade='F';
}if(mark>=25 && mark<45){
	grade='E';
} if(mark>=45 && mark<50) {
	grade='D';
} if(mark>=50 && mark<60) {
	grade='C';
} if(mark>=60 && mark<=80) {
	grade='B';
} if(mark>80) {
	grade='A';
	System.out.println("Your grade is "+grade);
	
}if(grade !=0) {
	System.out.println("Your grade is "+grade);
}else {
	System.out.println("Please enter a valid mark");


	}
}
}