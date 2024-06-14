package com.example.test;

import com.example.company.Manager;

public class TestManager {
 public static void main(String[] args) {
     // Attempt to create an instance of the Manager class
     Manager manager = new Manager("Bob", 80000);
     manager.displayDetails();
 }
}
