package com.example.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandlingDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter an integer: ");
         int number = scanner.nextInt();
         System.out.println("You entered: " + number);
     } catch (InputMismatchException e) {
         System.out.println("Invalid input! Please enter a valid integer.");
     } finally {
         System.out.println("Program execution completed.");
         scanner.close();
     }
 }
}
