package com.example.lambda;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaSortDemo {
 public static void main(String[] args) {
     // Array of strings to be sorted
     String[] strings = {"apple", "orange", "banana", "kiwi", "grape"};

     // Print the original array
     System.out.println("Original array:");
     for (String s : strings) {
         System.out.println(s);
     }

     // Sort the array in descending order using a lambda expression
     Arrays.sort(strings, (s1, s2) -> s2.compareTo(s1));

     // Print the sorted array
     System.out.println("\nSorted array in descending order:");
     for (String s : strings) {
         System.out.println(s);
     }
 }
}
