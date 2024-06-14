package assignment;
import java.util.Scanner;

public class RectangleArea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculating area
        double area = length * width;

        // Printing the result
        System.out.println("The area of the rectangle is: " + area);

        // Closing the scanner
        scanner.close();
    }
}
