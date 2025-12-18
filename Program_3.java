package com.example.test2;
import java.util.Scanner;
public class Program_3 {
    public static void printSeries(int terms, int current) {
        if (current > terms) {
            return;
        }
        System.out.print((2 * current - 1));
        if (current < terms) {
            System.out.print(", ");
        }
        printSeries(terms, current + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        if (a <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int terms = (a + 1) / 2;
        printSeries(terms, 1);
        scanner.close();
    }
}




