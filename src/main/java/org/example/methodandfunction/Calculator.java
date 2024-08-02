package org.example.methodandfunction;

public class Calculator {

    // I want to create a add function that add two int and return the value

    // function overloading
    public int add(int a, int b) {
        return a + b;
    }

    // add two float & return it

    public float add(float a, float b) {
        return a + b;
    }

    // add two long & return it

    public long add(long a, long b) {
        return a + b;
    }

    // add three int (a, b, c) return the sum

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public long add(long a, long b, long c) {
        return a + b + c;
    }
}
