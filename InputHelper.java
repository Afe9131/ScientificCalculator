package utils;

import java.util.Scanner;

public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();  // discard invalid input
        }
        return scanner.nextDouble();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();  // discard invalid input
        }
        return scanner.nextInt();
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.next();  // reads next token (use `nextLine()` for full line)
    }

    public static void closeScanner() {
        scanner.close();  // call this at end of program if needed
    }

    public static void close() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
