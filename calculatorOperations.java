
import utils.InputHelper;

public class calculatorOperations {

    public static void add() {
        double a = InputHelper.getDouble("Enter first number: ");
        double b = InputHelper.getDouble("Enter second number: ");
        System.out.println("Result: " + (a + b));
    }

    public static void subtract() {
        double a = InputHelper.getDouble("Enter first number: ");
        double b = InputHelper.getDouble("Enter second number: ");
        System.out.println("Result: " + (a - b));
    }

    public static void multiply() {
        double a = InputHelper.getDouble("Enter first number: ");
        double b = InputHelper.getDouble("Enter second number: ");
        System.out.println("Result: " + (a * b));
    }

    public static void divide() {
        double a = InputHelper.getDouble("Enter numerator: ");
        double b = InputHelper.getDouble("Enter denominator: ");
        if (b == 0) {
            System.out.println("Error: Division by zero.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void sine() {
        double deg = InputHelper.getDouble("Enter angle in degrees: ");
        System.out.println("Result: " + Math.sin(Math.toRadians(deg)));
    }

    public static void cosine() {
        double deg = InputHelper.getDouble("Enter angle in degrees: ");
        System.out.println("Result: " + Math.cos(Math.toRadians(deg)));
    }

    public static void logarithm() {
        double val = InputHelper.getDouble("Enter a positive number: ");
        if (val <= 0) {
            System.out.println("Error: Logarithm of non-positive number.");
        } else {
            System.out.println("Result: " + Math.log(val));
        }
    }

    public static void power() {
        double base = InputHelper.getDouble("Enter base: ");
        double exp = InputHelper.getDouble("Enter exponent: ");
        System.out.println("Result: " + Math.pow(base, exp));
    }

    public static void factorial() {
        int n = InputHelper.getInt("Enter a non-negative integer: ");
        if (n < 0) {
            System.out.println("Error: Factorial of negative number.");
            return;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }
}
