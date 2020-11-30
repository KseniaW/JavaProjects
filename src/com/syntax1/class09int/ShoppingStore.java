package com.syntax1.class09int;

public class ShoppingStore {
    String item;
    double price;
    int quantity;

    ShoppingStore (String item, double price, int quantity){
        System.out.println(item+" Total Value "+price);
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    public static double itemTotalPrice(double price,double price1) {
        return price + price1;
    }





}
