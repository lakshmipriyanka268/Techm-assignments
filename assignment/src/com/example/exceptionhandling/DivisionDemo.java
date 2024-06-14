package com.example.exceptionhandling;
public class DivisionDemo {
 public static void main(String[] args) {
     // Declare two numbers for division
     int numerator = 10;
     int denominator = 0; // This will cause an ArithmeticException

     try {
         // Attempt to divide the numbers
         int result = numerator / denominator;
         System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
         // Handle the exception
         System.out.println("ArithmeticException caught: Division by zero is not allowed.");
     } finally {
         // This block will always execute
         System.out.println("Finally block executed.");
     }

     System.out.println("Program continues after try-catch-finally block.");
 }
}

