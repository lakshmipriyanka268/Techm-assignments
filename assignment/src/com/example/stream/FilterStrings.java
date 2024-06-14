package com.example.stream;
import java.util.Arrays;
import java.util.List;

public class FilterStrings {
 public static void main(String[] args) {
     // List of strings
     List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

     // Filter and print strings that start with "A" using Stream API
     strings.stream()
            .filter(s -> s.startsWith("A"))
            .forEach(System.out::println);
 }
}
