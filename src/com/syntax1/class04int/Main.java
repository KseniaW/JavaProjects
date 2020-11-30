package com.syntax1.class04int;

public class Main {

    void number(int a,int b) {
            if (a % 2 == 0 && b % 2 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        public static void main(String[] args){
            Main m=new Main();

          m.number(4,6);

    }
}
