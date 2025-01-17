public class EvenNumbers {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        System.out.println("Even numbers between 1 and 100:");
        
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
