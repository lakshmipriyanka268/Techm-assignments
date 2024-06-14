package assignment;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the number of terms
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int numberOfTerms = scanner.nextInt();

        // Generating and printing Fibonacci series
        System.out.println("Fibonacci series up to " + numberOfTerms + " terms:");
        printFibonacciSeries(numberOfTerms);

        // Closing the scanner
        scanner.close();
    }

    // Method to generate and print Fibonacci series
    public static void printFibonacciSeries(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        if (n >= 1) {
            System.out.print(firstTerm + " ");
        }
        if (n >= 2) {
            System.out.print(secondTerm + " ");
        }

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
