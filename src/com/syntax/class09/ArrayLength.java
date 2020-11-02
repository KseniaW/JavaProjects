package com.syntax.class09;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] names={"Mike", "Ksenia", "jack", "Danulo", "Brayan"};	
		
		System.out.println(names[3]);
		int size=names.length;
System.out.println(size);
System.out.println(names[names.length-2]);

int a=2;
System.out.println(names[a]);
a+=2;
System.out.println(names[a]);

for(int i=0; i<names.length; i++) {
System.out.println(names[i]);
}

	}

}
