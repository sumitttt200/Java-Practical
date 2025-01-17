public class DataTypesDemo {
    public static void main(String[] args) {
        
        // Primitive data types
        int age = 25;                 // Integer data type
        double salary = 55000.50;     // Double data type
        char grade = 'A';             // Character data type
        boolean isEmployed = true;    // Boolean data type
        float height = 5.9f;          // Float data type
        byte level = 10;              // Byte data type
        short distance = 150;         // Short data type
        long population = 7800000000L; // Long data type
        
        // Non-primitive data types (Reference types)
        String name = "John Doe";     // String (non-primitive)
        int[] numbers = {1, 2, 3, 4}; // Array (non-primitive)
        
        // Displaying primitive data types
        System.out.println("Primitive Data Types:");
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Height: " + height);
        System.out.println("Level: " + level);
        System.out.println("Distance: " + distance);
        System.out.println("Population: " + population);
        
        // Displaying non-primitive data types
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("Name: " + name);
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
