
package org.example.assignment.assignment3;
public class AssApp {
    public static void main(String[] args) {
        // Testing the methods
        MathOperations mathOperations = new MathOperations();
        int sum = mathOperations.add(5, 10);
        AssPrinter.printResult("Addition (5 + 10)", sum);

        int diff = mathOperations.subtract(10, 5);
        AssPrinter.printResult("Subtraction (10 - 5)", diff);

        int product = mathOperations.multiply(5, 10);
        AssPrinter.printResult("Multiplication (5 * 10)", product);

        double quotient = mathOperations.divide(10, 5);
        AssPrinter.printResult("Division (10 / 5)", quotient);

        int sumThree = mathOperations.add(5, 10, 15);
        AssPrinter.printResult("Addition (5 + 10 + 15)", sumThree);

        int diffThree = mathOperations.subtract(20, 5, 5);
        AssPrinter.printResult("Subtraction (20 - 5 - 5)", diffThree);

        // Division by zero test
        double divByZero = mathOperations.divide(10, 0);
        AssPrinter.printResult("Division (10 / 0)", divByZero);
    }
}

