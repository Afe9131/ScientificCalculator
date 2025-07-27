
import utils.InputHelper;


public class ScientificCalculator {
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n==== Scientific Calculator ====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Sine");
            System.out.println("6. Cosine");
            System.out.println("7. Logarithm");
            System.out.println("8. Power");
            System.out.println("9. Factorial");
            System.out.println("0. Exit");

            int choice = InputHelper.getInt("Choose operation: ");

            switch (choice) {
                case 1 -> calculatorOperations.add();
                case 2 -> calculatorOperations.subtract();
                case 3 -> calculatorOperations.multiply();
                case 4 -> calculatorOperations.divide();
                case 5 -> calculatorOperations.sine();
                case 6 -> calculatorOperations.cosine();
                case 7 -> calculatorOperations.logarithm();
                case 8 -> calculatorOperations.power();
                case 9 -> calculatorOperations.factorial();
                case 0 -> {
                    running = false;
                    System.out.println("Calculator closed.");
                    InputHelper.close();  // close scanner safely
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
