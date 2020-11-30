package com.syntax1.class03int;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String name="Burju*Maria*Qasim";
        String[] array=name.split("[^A-Z a-z]");

            System.out.println(Arrays.toString(array));

        }
    }

