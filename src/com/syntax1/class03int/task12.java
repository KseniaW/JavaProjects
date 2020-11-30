package com.syntax1.class03int;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String momsName, dadsName,gender,babyName;

        System.out.println("Please enter dads name");
        dadsName=scanner.nextLine();

        System.out.println("Please enter moms name");
        momsName=scanner.nextLine();

        System.out.println("Is it a boy or a girl");
        gender= scanner.nextLine();

        if(gender.toLowerCase().startsWith("b")){
            babyName=(dadsName.substring(0,dadsName.length()/2))+(momsName.substring(momsName.length()/2));

        }else if(gender.toLowerCase().startsWith("g")) {
String firstPart=momsName.substring(0,momsName.length()/2);
String lastPart= dadsName.substring(dadsName.length()/2);
babyName=firstPart+lastPart;

        }else{
                babyName="No suggestions";
            }
         System.out.println(babyName);



    }
}
