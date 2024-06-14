package com.example.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFilter {
 public static void main(String[] args) {
     // List of integers
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

     // Print the original list
     System.out.println("Original list:");
     numbers.forEach(System.out::println);

     // Filter even numbers using a lambda expression
     List<Integer> evenNumbers = numbers.stream()
                                         .filter(n -> n % 2 == 0)
                                         .collect(Collectors.toList());

     // Print the filtered even numbers
     System.out.println("\nFiltered even numbers:");
     evenNumbers.forEach(System.out::println);
 }
}
