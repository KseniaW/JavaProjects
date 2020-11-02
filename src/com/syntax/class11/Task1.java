package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		int x = 10;
        int y = 5;
        x = x + y; //15
        y = x - y; //10
        x = x - y; //5
        System.out.println(" x = " + x + ", y = " + y);
System.out.println("Next1");

String a="Good";
String b="Night";
System.out.println(a+" "+b);
//Concatenate both the string str1 and str2 and store it in str1    
a = a+b;    
//Extract str2 from updated str1    
b = a.substring(0, (a.length() - b.length()));    
//Extract str1 from updated str1    
a = a.substring(b.length());    
    
System.out.println("Strings after swapping: " + a + " " + b);  
	}

}
