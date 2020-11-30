package com.syntax1.class09int;

public class ShopTest {
    public static void main(String[] args) {
        ShoppingStore blanket =new ShoppingStore("Blanket",99.98 ,1);

        ShoppingStore mattress =new ShoppingStore("Mattress",439.18,1);


        System.out.println("You purchased "+ ShoppingStore.itemTotalPrice(blanket.price, mattress.price)+" Today");
    }
}
