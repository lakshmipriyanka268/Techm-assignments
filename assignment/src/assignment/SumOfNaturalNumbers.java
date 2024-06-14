package assignment;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Calculate the sum of the first n natural numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // Print the sum
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
