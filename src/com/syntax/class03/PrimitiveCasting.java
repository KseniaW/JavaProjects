package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double d=12/7;
System.out.println(d);

double e=9;
System.out.println(e);
 //casting is converting 1 type to another
//2 types of casting:widening (implicit, automatically), narrowing(explicit,manual)
//byte->short->int->long->float->double
//double->float->long->int->short->byte

int i=(int)9.99; //narrowing, manually
System.out.println(i);

 byte b=(byte)130;
 System.out.println(b);
 
 






	}

}
