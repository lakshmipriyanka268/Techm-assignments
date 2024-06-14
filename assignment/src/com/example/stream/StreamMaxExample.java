package com.example.stream;
import java.util.Arrays;
import java.util.List;

public class StreamMaxExample {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(7, 2, 10, 1, 5, 3);

        // Using Stream API to find the maximum element
        Integer maxElement = numbers.stream()
                                    .max(Integer::compare)
                                    .orElseThrow(); // orElseThrow is used to handle if the list is empty

        // Print the original list
        System.out.println("Original list: " + numbers);

        // Print the maximum element
        System.out.println("Maximum element: " + maxElement);
    }
}
