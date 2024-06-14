package com.example.lambda;

import java.util.Arrays;

public class SumOfSquares {
 public static void main(String[] args) {
     // Array of integers
     int[] numbers = {1, 2, 3, 4, 5};

     // Calculate the sum of squares using a lambda expression and Stream API
     int sumOfSquares = Arrays.stream(numbers)
                              .map(n -> n * n) // Map each number to its square
                              .sum(); // Sum the squares

     // Print the result
     System.out.println("Sum of squares: " + sumOfSquares);
 }
}
