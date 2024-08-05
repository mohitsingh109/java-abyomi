package org.example.assignment.assignment3;

public class MathOperations { // Top level class (Only public & default AF is allowed)
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Overloaded method to subtract three integers
    public int subtract(int a, int b, int c) {
        return a - (b + c);
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public double divide(int a, int b) {
        if (b == 0) {
            return 0.0;
        }
        return (double) a / b;
    }

    public void printResult(String operation, double result) {
        System.out.println("Operation: " + operation + ", Result: " + result);
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations(); // creating an object
        int sum = mathOperations.add(5, 10);
        mathOperations.printResult("Addition (5 + 10)", sum);

        int diff = mathOperations.subtract(10, 5);
        mathOperations.printResult("Subtraction (10 - 5)", diff);

        int product = mathOperations.multiply(5, 10);
        mathOperations.printResult("Multiplication (5 * 10)", product);

        double quotient = mathOperations.divide(10, 5);
        mathOperations.printResult("Division (10 / 5)", quotient);

        int sumThree = mathOperations.add(5, 10, 15);
        mathOperations.printResult("Addition (5 + 10 + 15)", sumThree);

        int diffThree = mathOperations.subtract(20, 5, 5);
        mathOperations.printResult("Subtraction (20 - 5 - 5)", diffThree);

        // Division by zero test
        double divByZero = mathOperations.divide(10, 0);
        mathOperations.printResult("Division (10 / 0)", divByZero);
    }
}
