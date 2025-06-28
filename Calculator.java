// Calculator.java

import java.util.Scanner;

public class Calculator {

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return Double.NaN;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator - Java Version");
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice (1/2/3/4): ");
        String choice = scanner.nextLine();

        if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        System.out.print("Enter first number: ");
        double num1 = 0;
        double num2 = 0;

        try {
            num1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter second number: ");
            num2 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input.");
            scanner.close();
            return;
        }

        double result = 0;

        switch (choice) {
            case "1":
                result = add(num1, num2);
                break;
            case "2":
                result = subtract(num1, num2);
                break;
            case "3":
                result = multiply(num1, num2);
                break;
            case "4":
                result = divide(num1, num2);
                break;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
