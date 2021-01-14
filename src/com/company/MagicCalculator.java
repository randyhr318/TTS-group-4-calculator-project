package com.company;

import java.lang.Math;

public class MagicCalculator extends Calculator {

    // driver code
//    public static void main(String args])


    //        int num1 = 30;
//        double fact = 1;
    public static double squareRoot(int num1) {
        return Math.sqrt(num1);
    }

    public static double sin(int num1) {
        return Math.sin(num1);
    }

    public static double cosine(int num1) {
        return Math.cos(num1);
    }

    public static double tangent(int num1) {
        return Math.tan(num1);

    }

    public static int factorial(int num1) {
        int fact = 1;
        for (int i = 2; i <= num1; i++) {
            fact *= i;
        }
        return fact;

    }
}



