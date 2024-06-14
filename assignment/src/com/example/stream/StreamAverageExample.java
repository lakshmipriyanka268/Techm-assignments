package com.example.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamAverageExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Read integers from the user until they enter a non-integer value
        System.out.println("Enter a list of integers (enter a non-integer to finish):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Using Stream API to calculate the average of integers
        double average = numbers.stream()
                                .mapToInt(Integer::intValue) // Convert Integer to int
                                .average()
                                .orElse(0.0); // If list is empty, return 0.0

        // Print the original list
        System.out.println("Original list: " + numbers);

        // Print the average
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}
