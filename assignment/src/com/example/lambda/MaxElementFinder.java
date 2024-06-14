package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElementFinder {
 public static void main(String[] args) {
     // List of integers
     List<Integer> numbers = Arrays.asList(10, 4, 2, 23, 45, 1, 90);

     // Find the maximum element using lambda expression and Stream API
     Optional<Integer> maxElement = numbers.stream()
                                           .max((n1, n2) -> n1.compareTo(n2));

     // Print the maximum element
     maxElement.ifPresent(max -> System.out.println("Maximum element: " + max));
 }
}
