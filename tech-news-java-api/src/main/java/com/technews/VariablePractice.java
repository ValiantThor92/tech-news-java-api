package com.technews;

public class VariablePractice {
    public static void main(String[] args) {
        int a = 20;
        double b = 19.99;
        String c = "dog";

        // calculated variable sum is a double
        double sum = a + b;

        // calculated variable concat is a String
        String concat = a + c;

        // value of sum is 39.99
        System.out.println(sum);

        // value of concat is "20dog"
        System.out.println(concat);

    }
}
