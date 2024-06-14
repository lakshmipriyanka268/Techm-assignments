package com.example.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using Stream API to map integers to their squares
        List<Integer> squares = numbers.stream()
                                       .map(x -> x * x)
                                       .collect(Collectors.toList());

        // Print the original list
        System.out.println("Original list: " + numbers);

        // Print the list of squares
        System.out.println("Squares of numbers: " + squares);
    }
}
