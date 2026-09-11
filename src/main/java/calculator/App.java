package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("=== Gradle CLI Calculator ===");
        System.out.println("Commands: add, sub, export, exit");

        while (true) {
            System.out.print("> ");
            String command = scanner.next();

            if (command.equalsIgnoreCase("exit")) {
                break;
            } else if (command.equalsIgnoreCase("export")) {
                try {
                    calculator.exportHistory("history.json");
                    System.out.println("History exported to history.json");
                } catch (Exception e) {
                    System.out.println("Failed to export: " + e.getMessage());
                }
            } else if (command.equalsIgnoreCase("add") || command.equalsIgnoreCase("sub")) {
                System.out.print("Enter first number: ");
                double a = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double b = scanner.nextDouble();

                double result = command.equalsIgnoreCase("add") 
                    ? calculator.add(a, b) 
                    : calculator.subtract(a, b);
                    
                System.out.println("Result: " + result);
            } else {
                System.out.println("Unknown command.");
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }
}
