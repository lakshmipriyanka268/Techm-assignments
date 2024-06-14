package com.example.exceptionhandling;
public class AgeValidator {
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be at least 18.");
     } else {
         System.out.println("Age is valid: " + age);
     }
 }

 public static void main(String[] args) {
     try {
         // Test with a valid age
         validateAge(20);
         // Test with an invalid age
         validateAge(15);
     } catch (InvalidAgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}

