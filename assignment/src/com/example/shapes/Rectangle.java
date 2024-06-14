package com.example.shapes;

public class Rectangle {
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

 // Main method for testing
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(5, 3);
     System.out.println("Area: " + rectangle.getArea());
     System.out.println("Perimeter: " + rectangle.getPerimeter());
 }
}

