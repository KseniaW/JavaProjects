package com.syntax1.class16;

class Main {
    public static void main(String[] args) {
Child child=new Child("Vienna");



    }

   public static class Parent {
        String city;
Parent(String city) {
            this.city=city;
            System.out.println(city);
        }

        Parent() {
            System.out.println("Parent Constructor");
        }
    }

   public static class Child extends Parent{
      Child(String city){
        super(city);
        }

    }
}