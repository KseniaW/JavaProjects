package com.syntax1.class03int;

import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {
        //how many sentences
        String a="Is it Saturday? Is it raining? Do we have a class?";
        System.out.println(a.replaceAll("[\\sA-Za-z0-9]","").length());
        }
    }

