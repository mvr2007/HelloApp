public class HelloApp {
    public static void main(String[] args) {
        // Check if at least one argument was provided
        if (args.length > 0) {
            // UC2: Access the first argument at index 0
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback to UC1 behavior if no input is given
            System.out.println("Hello, World!");
        }
    }
}