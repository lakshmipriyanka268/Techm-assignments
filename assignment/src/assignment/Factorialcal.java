package assignment;
import java.util.Scanner;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}

