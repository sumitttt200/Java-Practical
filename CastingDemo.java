public class CastingDemo {
    public static void main(String[] args) {
        
        int intValue = 50;        // int is a smaller data type
        double doubleValue = intValue; // Implicit cast from int to double
        
        System.out.println("Implicit Casting (int to double):");
        System.out.println("Original int value: " + intValue);
        System.out.println("Converted double value: " + doubleValue);
        doubleValue = 99.99; // Assigning a double value
        intValue = (int) doubleValue; // Explicit cast from double to int
        
        System.out.println("\nExplicit Casting (double to int):");
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted int value: " + intValue);
        double largeValue = 12345.6789;
        int truncatedValue = (int) largeValue; // Explicit casting truncates the decimal part
        System.out.println("\nExplicit Casting with Loss of Precision:");
        System.out.println("Original double value: " + largeValue);
        System.out.println("Converted int value (truncated): " + truncatedValue);
    }
}
