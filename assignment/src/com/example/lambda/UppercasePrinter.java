package com.example.lambda;

import java.util.Arrays;
import java.util.List;

public class UppercasePrinter {
 public static void main(String[] args) {
     // List of strings
     List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

     // Print each string in uppercase using a lambda expression
     strings.forEach(s -> System.out.println(s.toUpperCase()));
 }
}
