package assignment;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculating factorial
        long factorial = calculateFactorial(number);

        // Printing the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Closing the scanner
        scanner.close();
    }

    // Method to calculate factorial recursively
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is 1
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}