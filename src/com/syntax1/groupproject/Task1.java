package com.syntax1.groupproject;

public class Task1 {
    public interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }
    static class Circle2 implements Shape {
        double radius;
        Circle2(double radius){
            this.radius=radius;
        }
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        @Override
        public double calculatePerimeter() {
            return 2*Math.PI*radius;
        }
    }
    static class Square2 implements Shape {
        double length, width;
        Square2(double length, double width){
            this.length=length;
            this.width=width;
        }
        @Override
        public double calculateArea() {
            return length*width;
        }
        @Override
        public double calculatePerimeter() {
            return length*2+width*2;
        }
    }
    static class ShapeTester{
        public static void main(String[] args) {
            Circle2 circle = new Circle2(10.9);
            System.out.println("Area of circle is "+circle.calculateArea());
            System.out.println("Perimeter of circle is "+circle.calculatePerimeter());
            Square2 square = new Square2(20.2,30.39);
            System.out.println("Area of square is "+square.calculateArea());
            System.out.println("Perimeter of square is "+square.calculatePerimeter());
        }
    }
}
