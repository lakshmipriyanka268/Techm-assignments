package com.example.shapes;

import java.util.ArrayList;

public class Rectanglesides {
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Method to calculate the area
 public double getArea() {
     return length * width;
 }

 // Method to calculate the perimeter
 public double getPerimeter() {
     return 2 * (length + width);
 }

 // Getters and Setters for length and width (optional)
 public double getLength() {
     return length;
 }

 public void setLength(double length) {
     this.length = length;
 }

 public double getWidth() {
     return width;
 }

 public void setWidth(double width) {
     this.width = width;
 }

 public static void main(String[] args) {
     // Create an ArrayList to store Rectangle objects
     ArrayList<Rectangle> rectangles = new ArrayList<>();

     // Add Rectangle objects to the ArrayList
     rectangles.add(new Rectangle(5, 3));
     rectangles.add(new Rectangle(7, 2));
     rectangles.add(new Rectangle(6, 4));

     // Retrieve and print the area and perimeter of each Rectangle
     for (Rectangle rectangle : rectangles) {
         System.out.println("Rectangle with length " + rectangle.getLength() + " and width " + rectangle.getWidth());
         System.out.println("Area: " + rectangle.getArea());
         System.out.println("Perimeter: " + rectangle.getPerimeter());
         System.out.println();
     }
 }
}

