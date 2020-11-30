package com.syntax1.class12;

public class MethodOverLoading {
    public void print(){
        System.out.println("no arg");
    }
    public void print(String name,int number){
        System.out.println("String name, int number");
    }
    public void print(int number, String name){
        System.out.println("int number, String name");
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading=new MethodOverLoading();
        methodOverLoading.print("name",123);
        methodOverLoading.print();
        methodOverLoading.print(4567,"name");
    }
}
