package com.syntax1.class11;

class MathTeacher extends Teacher {
    int experienceInTeachingAlgebra;
    int experienceInTeachingCalculus;
    int experienceInTeachingProbability;

    MathTeacher(String name, int experience, String degree, String subject) {
        super(name, experience, degree, subject);
    }


    void print(){
        System.out.println("print from math");
    }
}
