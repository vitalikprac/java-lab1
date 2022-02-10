package com.prachov;

import java.util.Scanner;

/**
 * Даны целые стороны прямоугольника, найти его диагональ, периметр
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 4: First rectangle side");
        int firstSide = scan.nextInt();
        System.out.println("Task 4: Second rectangle side");
        int secondSide = scan.nextInt();

        double diagonal = Math.sqrt(firstSide * firstSide + secondSide * secondSide);
        int perimeter = firstSide * 2 + secondSide * 2;

        System.out.println("Task 4: Diagonal = " + diagonal);
        System.out.println("Task 4: Perimeter = " + perimeter);
    }
}
