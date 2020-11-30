package com.syntax1.class11;

public class Registration {
    private String email, userName, password;

    Registration(String email, String userName, String password){
        if(email!="yahoo"){
            System.out.println("Please enter only yahoo email");
        }else{
            this.email=email;
        }if(userName==password){
            System.out.println("userName and Password cannot match");

        }else if(userName==null||password==null){
            System.out.println("Username or password is empty");
        }else if(userName.length()<=6||password.length()<=6){
            System.out.println("Username or password is too short");
        }else{
            this.userName=userName;
            this.password=password;
        }

    }
   void print(){
       System.out.println(email+" :email "+userName+" :userName "+password+" :password");

   }

    public static void main(String[] args) {
        Registration registration=new Registration("yahoo","yyyyyyt","yttttttttttt");
        registration.print();
    }
}
