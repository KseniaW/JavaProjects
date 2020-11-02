package com.syntax1.class01int;

public class Application {
    public static void main(String[] args) {
       AccountClass BurjuAcc=new AccountClass();
       BurjuAcc.accountID="123";
       BurjuAcc.UserName="Burju";
       BurjuAcc.Password="pass123";
       BurjuAcc.balance=1000000;
       BurjuAcc.TypeOfAccount="checking";
       BurjuAcc.limit=125;

       boolean login=BurjuAcc.login("Burju","436576");
        System.out.println(login);
    }
}
