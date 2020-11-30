package com.syntax1.class05int;

public class ClassA {
    String createEmail(String firstName, String lastName, String emailType){

        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {

        ClassA classA=new ClassA();
        String email=classA.createEmail("Ksenia", "White", "yahoo");
        System.out.println(email);
    }


}
