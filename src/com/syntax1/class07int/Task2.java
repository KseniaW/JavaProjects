package com.syntax1.class07int;

public class Task2 {
    String name;
    double subj1;
    double subj2;
    double subj3;

    Task2(String nameValue, double subj1Value, double subj2Value, double subj3Value){
        name=nameValue;
        subj1=subj1Value;
        subj2=subj2Value;
        subj3=subj3Value;
    }
   void printGradeAverage(){
        double avg=(subj1+subj2+subj3)/3;
       System.out.println("Average for "+name+" "+avg);
   }

    public static void main(String[] args) {

        Task2 t=new Task2("Marta",93,90,91);
        t.printGradeAverage();
        Task2 t1=new Task2("Jack",87,98,91);
        t1.printGradeAverage();
        Task2 t2=new Task2("Danilo",100,100,100);
        t2.printGradeAverage();
        Task2 t3=new Task2("Maria", 87,87,90);
        t3.printGradeAverage();
        Task2 t4=new Task2("Nabin",90,98,97);
        t4.printGradeAverage();

    }

}
