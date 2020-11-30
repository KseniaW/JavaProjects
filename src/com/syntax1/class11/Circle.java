package com.syntax1.class11;

public class Circle extends Shape {


    Circle(double radius){
        super(radius);

    }
    public void calculateArea(){
        double area=3.14*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Circle t2=new Circle(2);
        t2.calculateArea();
    }
}
