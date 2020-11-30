package com.syntax1.class09int;

public class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfTheClass;

    SyntaxTechnologies(){
        System.out.println();
    }
    SyntaxTechnologies(String schoolName,int batch,int year, String lastDayOfTheClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfTheClass = lastDayOfTheClass;
    }
    void displayInfo() {
        System.out.println(schoolName+" "+batch +" " + year + " " + lastDayOfTheClass);
    }

}
