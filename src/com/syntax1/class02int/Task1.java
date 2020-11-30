package com.syntax1.class02int;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String userName;
        String password;
        String ConfirmedPassword;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter username");
        userName = scanner.nextLine();
        System.out.println("Please enter password");
        password = scanner.nextLine();
        System.out.println("Confirm password");
        ConfirmedPassword=scanner.nextLine();

        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and password cant be empty");
        } else {
            if (password.length() < 8) {
                System.out.println("Password is too short");
            } else{
                if(password.contains(userName)){
                    System.out.println("password cannot contain a username");
                }else{
                    if(!password.equals(ConfirmedPassword)){
                        System.out.println("Passwords dont match");
                    }else{
                        System.out.println("Your username and password has been created");
                    }

                }


            }

        }
    }
}
