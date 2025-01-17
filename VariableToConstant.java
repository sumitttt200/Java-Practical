public class VariableToConstant {
    public static void main(String[] args) {
        int variable = 50;
        System.out.println("Original variable value: " + variable);
        final int constant = variable; // 'constant' is now a constant, and its value can't be changed
        System.out.println("Constant value (after conversion): " + constant);
        System.out.println("Constant value after attempt to modify: " + constant);
    }
}
