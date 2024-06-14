package assignment;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the year
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Checking if it's a leap year
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If the year is divisible by 100, it must also be divisible by 400 to be a leap year
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Printing the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Closing the scanner
        scanner.close();
    }
}
