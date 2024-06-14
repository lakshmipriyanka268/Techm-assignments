package com.example.stream;
import java.util.Arrays;

public class SumOfArrayElements {
 public static void main(String[] args) {
     // Array of integers
     int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

     // Calculate the sum of all elements using Stream API
     int sum = Arrays.stream(numbers)
                     .sum();

     // Print the sum
     System.out.println("Sum of all elements: " + sum);
 }
}
