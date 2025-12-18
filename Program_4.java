package com.example.test2;
import java.util.*;
public class Program_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }
        System.out.println("Output:");
        System.out.println(result);
        scanner.close();
    }
}


