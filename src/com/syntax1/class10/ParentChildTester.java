package com.syntax1.class10;

public class ParentChildTester {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printSomething();

        Child child=new Child();
        child.printSomething();
        child.differentPrintMethod();
        //Compile time errors are better than run time errors
    }
}