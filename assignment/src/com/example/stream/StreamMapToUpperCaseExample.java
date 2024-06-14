package com.example.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToUpperCaseExample {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        // Using Stream API to convert each string to uppercase
        List<String> uppercaseStrings = strings.stream()
                                              .map(String::toUpperCase)
                                              .collect(Collectors.toList());

        // Print the original list
        System.out.println("Original list: " + strings);

        // Print the list of uppercase strings
        System.out.println("Uppercase strings: " + uppercaseStrings);
    }
}
