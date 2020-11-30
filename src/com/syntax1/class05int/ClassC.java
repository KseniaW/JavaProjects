package com.syntax1.class05int;

public class ClassC {
    char getGrade(int marks){
        char grade;
     if(marks>=90 && marks<=100){
         grade='A';

        }else if(marks>=80&& marks<=90){
         grade='B';
     }else if(marks>=70 &&marks<=80){
         grade='C';
     }else if (marks>=60 && marks<=70){
         grade='D';
     }else{
         grade='F';
     }return grade;



        }

    public static void main(String[] args) {
        ClassC classC=new ClassC();
        System.out.println("classC.getGrade(90)" +classC.getGrade(90));
    }
    }

