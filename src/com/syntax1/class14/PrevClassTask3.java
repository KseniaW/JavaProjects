package com.syntax1.class14;

public class PrevClassTask3 {
    private void print(){
        System.out.println("Im  private, no parameters");
    }
    private void print(int a){
        System.out.println("1  int parameter");
    }
    private void print(String var){
        System.out.println("1 String parameter");
    }

    public static void main(String[] args) {
        PrevClassTask3 prevClassTask3=new PrevClassTask3();
        prevClassTask3.print();
        prevClassTask3.print(7);
        prevClassTask3.print("Ksenia");
    }
}
