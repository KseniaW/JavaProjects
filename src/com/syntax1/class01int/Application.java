package com.syntax1.class01int;

import javafx.stage.Stage;

import java.util.Scanner;

public abstract class Application {
    public static void main(String[] args) {
       AccountClass BurjuAcc=new AccountClass();
       BurjuAcc.accountID="123";
       BurjuAcc.UserName="Burju";
       BurjuAcc.Password="pass123";
       BurjuAcc.balance=10000;
       BurjuAcc.TypeOfAccount="checking";
       BurjuAcc.limit=125;
       boolean isLogged= BurjuAcc.login("Burju","ahdg");
        System.out.println(isLogged);

        double amounttoTransfer= BurjuAcc.amountTransfer(100);
        if (amounttoTransfer==0){
            System.out.println("Insufficient funds");
        }else{
            System.out.println(amounttoTransfer+" Transferred");
        }

       AccountClass KAcc=new AccountClass();
       KAcc.accountID="K";
       KAcc.UserName="Ksenia";
       KAcc.Password="uy";
       KAcc.balance=1000000;
       KAcc.TypeOfAccount="savings";
       KAcc.limit=1000;

       boolean login=KAcc.login("Ksenia","56");
        System.out.println(login);


    }

    public abstract void start(Stage primaryStage)throws Exception;
}
