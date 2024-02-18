package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа a, b, c:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (Triangle(a, b, c)) {
            if (PryamTriangle(a, b, c)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
            } else if (RavnobedTriangle(a, b, c)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
            } else if (a == b && b == c) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
            } else {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
            }
        } else {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        }
    }

    private static boolean Triangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }

    private static boolean PryamTriangle(int a, int b, int c) {
        return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
    }

    private static boolean RavnobedTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }
}
