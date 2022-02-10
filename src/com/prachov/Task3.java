package com.prachov;

import java.util.Scanner;

/**
 * Дано целое число, найти его факториал
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 3: Input number ");
        int number = scan.nextInt();

        int factorial = calculateFactorial(number);

        System.out.println("Task 3: Factorial = " + factorial);
    }

    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }

        return number * calculateFactorial(number - 1);
    }
}
