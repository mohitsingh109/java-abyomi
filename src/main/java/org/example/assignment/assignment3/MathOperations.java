package org.example.assignment.assignment3;
public class MathOperations {
    // Method to add two integers
    public  int add(int a, int b) {
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
    public  int subtract(int a, int b, int c) {
        return a - (b + c);
    }

    // Method to multiply two integers
    public  int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public  double divide(int a, int b) {
        if (b == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return (double) a / b;
    }
}
