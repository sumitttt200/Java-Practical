public class VariableScopeDemo {

    // Global (Instance) variable
    int globalVariable = 50;

    public void localVariableExample() {
        // Local variable
        int localVariable = 100;

        // Accessing the local variable within the same method
        System.out.println("Local variable inside the method: " + localVariable);
    }

    public void accessGlobalVariable() {
        // Accessing the global variable inside the method
        System.out.println("Global variable inside another method: " + globalVariable);
    }

    public static void main(String[] args) {
        // Creating an object of the class to access non-static methods
        VariableScopeDemo demo = new VariableScopeDemo();

        // Calling method to access local variable (local to that method)
        demo.localVariableExample();

        // Calling method to access global variable
        demo.accessGlobalVariable();

        // Attempting to access localVariable directly in the main method will cause an error
        // System.out.println(localVariable); // Error: localVariable cannot be resolved

        // Global variable is accessible from here (main method) via the object
        System.out.println("Global variable from main method: " + demo.globalVariable);
    }
}
