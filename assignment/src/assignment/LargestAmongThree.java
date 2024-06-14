package assignment;
import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();
        
        // Determine the largest number among the three
        double largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
