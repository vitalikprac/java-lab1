package com.prachov;

import java.util.Scanner;

/**
 * Задано 3 целых числа. Найти их среднее арифметическое и ближайшее к нему целое.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 1: Input three numbers");
        final int firstNumber = scan.nextInt();
        final int secondNumber = scan.nextInt();
        final int thirdNumber = scan.nextInt();

        final double averageArithmetic = (firstNumber + secondNumber + thirdNumber) / 3.0;
        final long nearestNumber = Math.round(averageArithmetic);

        System.out.println("Task 1: Average arithmetic = " + averageArithmetic);
        System.out.println("Task 1: Nearest integer = " + nearestNumber);
    }

}
