package com.syntax1.class17;

public class FinalMethodChildClass extends FinalMethodClass{

    @Override
    double add(double num1, double num2) {
        System.out.println("new code added");
        return super.add(num1, num2);
    }

}

