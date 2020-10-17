package com.syntax.class04;

import java.util.Scanner;

public class ReplHw {


  public static void main(String[] args){
    System.out.println("PLease enter first number");
    Scanner s1=new Scanner (System.in);
    Scanner s2=new Scanner (System.in);
    int x=s1.nextInt();
     System.out.println("Please enter second number");
    int y=s2.nextInt();
    
    if(x*y>0){
      System.out.println("true");
    }else {
      System.out.println("false");
    }
	

  }
}
