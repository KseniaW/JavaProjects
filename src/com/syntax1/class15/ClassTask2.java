package com.syntax1.class15;

public class ClassTask2 {
}
class CreditCard{
    double balance;
    double interest;
    public CreditCard(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }
    double getInterest(){ //instance methods
        return balance*interest;
    }
}

class Visa extends CreditCard{

    public Visa(double balance, double interest) {
        super(balance, interest);
    }

}
class AX extends CreditCard{

    public AX(double balance, double interest) {
        super(balance, interest);
    }

    double getInterest(){
        return balance*interest*2;
    }
}
class CreditCardTester{
    public static void main(String[] args) {
Visa visa=new Visa(100,5);
        System.out.println(visa.getInterest());
        AX ax=new AX(100,5);
        System.out.println(ax.getInterest());
    }
}
