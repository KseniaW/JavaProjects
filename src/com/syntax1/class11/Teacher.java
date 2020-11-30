package com.syntax1.class11;

public class Teacher {
    String name;
    int experience;
    double salary;
    String degree;
    String education;
    String subject;
    Teacher(String name,int experience,String degree,String subject){
        this.name=name;
        this.experience=experience;
        this.degree=degree;
        this.subject=subject;
    }
    Teacher(String name,int experience,String degree,String subject,double salary,String education){
        this(name, experience, degree, subject);
        this.salary=salary;
        this.education=education;
    }


    void print(){
        System.out.println(name+experience);
    }
}
