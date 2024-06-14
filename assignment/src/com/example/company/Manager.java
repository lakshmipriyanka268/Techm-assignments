package com.example.company;

public class Manager {
 private String name;
 private double salary;

 // Constructor
 public Manager(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 // Method to display manager details
 public void displayDetails() {
     System.out.println("Manager Name: " + name);
     System.out.println("Manager Salary: " + salary);
 }

 // Main method for testing within the same package
 public static void main(String[] args) {
     Manager manager = new Manager("Alice", 75000);
     manager.displayDetails();
 }
}

