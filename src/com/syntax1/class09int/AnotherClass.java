package com.syntax1.class09int;

public  class AnotherClass {

    private static void a() {
        System.out.println("private");
    }

    static void b() {
        System.out.println("default");
    }

    static protected void c() {
        System.out.println("protected");
    }

    static public void d() {
        System.out.println("public");
    }


    static class Main {
        public static void main(String[] args) {
            AnotherClass anotherClass=new AnotherClass();
            AnotherClass.a();
            AnotherClass.b();
            AnotherClass.c();
            AnotherClass.b();
        }
    }

}
