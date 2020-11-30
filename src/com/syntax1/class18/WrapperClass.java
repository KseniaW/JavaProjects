package com.syntax1.class18;

public class WrapperClass {
    public static void main(String[] args) {

        //8 primitive data types
        byte byteNumbers = 100; //can store max -128 to 127
        short shortNumber = 1000;
        long longNumber = 1324531215;
        float floatNumber = 150.2134f;
        int number = 10;
        double numberWithDecimalPoints = 10.5;
        char character = 'A';
        boolean Flags = true;

        String stringNumber="10";
       int convertedNumber=Integer.parseInt(stringNumber);
        System.out.println(convertedNumber*2);
        Byte byteNonPrimitive=10;
        Byte nonPrimitiveByteNumbers = 100; //can store max -128 to 127
        Short nonPrimitiveShortNumber = 1000;

        Float nonPrimitiveFloatNumber = 150.2134f;
        Integer nonPrimitiveNumber = 10;
        Double nonPrimitiveNumberWithDecimalPoints = 10.5;
        Character nonPrimitiveCharacter = 'A';
        Boolean nonPrimitiveFlags = true;

        int primitiveInt=10;
        Integer nonPrimitive=primitiveInt;
        System.out.println(nonPrimitive.doubleValue());

    }
}