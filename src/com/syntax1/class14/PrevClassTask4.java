package com.syntax1.class14;

public class PrevClassTask4 {
    //Area
    //Square, Rectangle,

    double getArea(double width){
        return width*width*width;
    }
    double getArea(double height, double width){
        return height*width;
    }

    public static void main(String[] args) {

        PrevClassTask4 prevClassTask4=new PrevClassTask4();
        System.out.println("Area of a square"+ prevClassTask4.getArea(5));
    }

}
