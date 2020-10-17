package com.syntax.class07;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=10;
while(c<31) {
	if(c%2==0) {
		System.out.println(c+" ");
		c++; //we will get infinite loop
	}
}
	}

}
