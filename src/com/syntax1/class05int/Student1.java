package com.syntax1.class05int;

public class Student1 {
    String studentName;
    int studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Student1 s=new Student1();
        s.studentID=123;
        s.studentName="Moneer";
        Student1.numberOfStudents++;
        System.out.println(s.studentID);
        System.out.println(s.studentName);
        System.out.println(Student1.numberOfStudents);

        Student1 s1=new Student1();
        s1.studentID=455;
        s1.studentName="Davit";
        Student1.numberOfStudents++;
        System.out.println(s1.studentName);
        System.out.println(s1.studentID);
        System.out.println(Student1.numberOfStudents

        );
    }
}
