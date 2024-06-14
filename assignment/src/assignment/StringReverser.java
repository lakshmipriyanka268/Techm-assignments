package assignment;
import java.util.Scanner;

public class StringReverser {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
