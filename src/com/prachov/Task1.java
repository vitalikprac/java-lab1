package com.prachov;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Задано 3 целых числа. Найти их среднее арифметическое и ближайшее к нему целое.
 */
public class Task1 {
    private static final int INPUT_NUMBERS_COUNT = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 1: Input three numbers");
        final List<Integer> numbers = IntStream
                .range(0, INPUT_NUMBERS_COUNT)
                .map((a) -> scan.nextInt())
                .boxed()
                .collect(Collectors.toList());

        final double averageArithmetic = calculateAverageArithmetic(numbers);
        final long nearestNumber = Math.round(averageArithmetic);

        System.out.println("Task 1: Average arithmetic = " + averageArithmetic);
        System.out.println("Task 1: Nearest integer = " + nearestNumber);
    }

    private static double calculateAverageArithmetic(List<Integer> numbers) {
        var sum = (double) numbers.stream().reduce(0, Integer::sum);
        return sum / numbers.size();
    }
}
