package com.example.test;
import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
 public static void main(String[] args) {
     // Create a HashMap to store student names and their marks
     HashMap<String, Integer> studentMarks = new HashMap<>();

     // Add student names and their corresponding marks
     studentMarks.put("Alice", 85);
     studentMarks.put("Bob", 90);
     studentMarks.put("Charlie", 78);
     studentMarks.put("David", 92);
     studentMarks.put("Eve", 88);

     // Retrieve and print the names and marks of all students
     for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
         System.out.println("Student: " + entry.getKey() + ", Marks: " + entry.getValue());
     }
 }
}
