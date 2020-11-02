package com.syntax.class11;

public class task9 {
    public static void main(String[] args) {
        String [][] countries={
                {"USA","Canada","Mexico","Cuba"},
                {"Brazil","Argentina","Colombia","Peru"},
                {"Ukraine","Italy","France"},
                {"Japan","Indonesia","China","India"},
                {"Nigeria","Kenya","Ethiopia"}
        };
        int total=0;

        for (int i = 0; i < countries.length ; i++) {
            total=total+ countries[i].length;
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(total);
    }
}
