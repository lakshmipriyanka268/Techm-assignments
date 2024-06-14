package assignment;
import java.util.Scanner;

public class ArrayAverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        double average = calculateAverage(array);
        
        System.out.println("The average of the array elements is: " + average);
    }
    
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        return (double) sum / array.length;
    }
}

