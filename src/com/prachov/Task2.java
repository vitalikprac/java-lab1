package com.prachov;

import java.util.Scanner;

/**
 * Даны 2 целые длины сторон треугольника и целый угол между ними в градусах. Найдите площадь.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 2: Input first side");
        final int firstSide = scan.nextInt();
        System.out.println("Task 2: Input second side");
        final int secondSide = scan.nextInt();
        System.out.println("Task 2: Input angle between sides");
        final int angle = scan.nextInt();

        final double square = 0.5 * (firstSide * secondSide * Math.sin(angle * Math.PI / 180));

        System.out.println("Task 2: Square of the triangle = " + square);
    }
}
