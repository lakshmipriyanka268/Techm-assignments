package com.example.test;
import java.util.ArrayList;

public class ArrayListDemo {
 public static void main(String[] args) {
     // Create an ArrayList to hold elements of different types
     ArrayList<Object> list = new ArrayList<>();

     // Add elements of different types
     list.add(42);            // Integer
     list.add("Hello, world"); // String
     list.add(3.14);          // Double
     list.add(true);          // Boolean
     list.add('A');           // Character

     // Print the elements of the ArrayList
     for (Object element : list) {
         System.out.println(element);
     }
 }
}
