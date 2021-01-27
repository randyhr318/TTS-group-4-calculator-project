package com.company;

import com.company.Calculator;
import com.company.MagicCalculator;

public class Main {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 6;
        // calc class
        System.out.println("Adding num1 and num2");
        System.out.println(Calculator.add(num1, num2));

        System.out.println("Subtracting num1 and num2");
        System.out.println(Calculator.subtract(num1, num2));

        System.out.println("Multiplying num1 and num2");
        System.out.println(Calculator.multiply(num1, num2));

        System.out.println("Dividing num1 and num2");
        System.out.println(Calculator.divide(num1, num2));

        System.out.println("Squaring num1");
        System.out.println(Calculator.square(num1));

        // Magic Calc Class

        System.out.println("Square Root");
        System.out.println(MagicCalculator.squareRoot(num1));

        System.out.println("Sin");
        System.out.println(MagicCalculator.sin(num1));

        System.out.println("Cosine");
        System.out.println(MagicCalculator.cosine(num1));

        System.out.println("Tangent");
        System.out.println(MagicCalculator.tangent(num1));

        System.out.println("Factorial");
        System.out.println(MagicCalculator.factorial(num1));


//        System.out.println("please enter number");
    }
}
