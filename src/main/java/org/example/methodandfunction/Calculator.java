package org.example.methodandfunction;

public class Calculator {

    // we don't have any data member
    // I want to create a add function that add two int and return the value

    // function overloading
    public static int add(int a, int b) { // static function???
        return a + b;
    }

    // add two float & return it

    public static float add(float a, float b) {
        return a + b;
    }

    // add two long & return it

    public static long add(long a, long b) {
        return a + b;
    }

    // add three int (a, b, c) return the sum

    public static int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public static long add(long a, long b, long c) {
        return a + b + c;
    }
}
