import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Read the user input as an integer
        
        // Use a conditional statement to check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
