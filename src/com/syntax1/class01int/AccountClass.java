package com.syntax1.class01int;

public class AccountClass {
    String accountID;
    String UserName;
    String Password;
    double balance;
    double limit;
    String TypeOfAccount;
    boolean isBlocked;

    double amountTransfer (double amounttoTransfer){
        if (amounttoTransfer < balance) {
            return balance = balance - amounttoTransfer;
        } else {
            return 0;
        }
    }

    boolean login(String enteredUserName, String enteredPassword) {
        if (UserName.equals(enteredUserName) && Password.equals(enteredPassword)) {
            return true;

        } else {
            return false;
        }



    }
}
