package org.example.operator;

public class Operator {

    public static void main(String[] args) { // JVM
        // Operator
        // +, -, %, /, *, ++, --

        int add = 10 + 20;
        int sub = 100 - 20;
        int mod = 10 % 9; // ?
        int divide = 100/10;
        int mul = 10 * 10;

        int value1 = 10;
        int value2 = 20;

        int total = value1 + value2;
        long value3 = 10L + 20L;

        float value4 = 10.3f + 20.4f;

        // () (TOP)
        // * / % (High) LEFT to RIGHT
        // +, - LEFT to RIGHT
        int value5 = 100 - 5 * 4;
        System.out.println(value5); //80

        int value6 = 20 + 10 * 5 / 2 + 2 * 2;
        // 20 + 25 + 4
        // 49
        System.out.println(value6); // 49

        int value7 = 5 * 2 - 10/2 + 4 * 6;
        // 10 - 5 + 24
        // 5 + 24
        System.out.println(value7); // 29

        int value8 = 10 - 100 + 20 - 20 - 40;
        // -90 + 20 - 20 - 40
        // -70 - 20 - 40
        // -90 - 40
        // - 130
        System.out.println(value8); // -130

        int value9 = 50/5*3 - 92%9 + 100/10*2;
        // 30 - 2 + 20
        // 28 + 20
        // 48
        System.out.println(value9); // 33

        int value10 = 15 % 4 * 5 - 10 / 2 * 5 + 5 /- 2 * 2;

        // 3 * 5 - 25 + -4
        // 15 - 25 - 4
        // -10 - 4
        // - 14
        System.out.println(value10); //-31, -26 , -14

        int value11 = 7 % 5 * -5 + 20 / 5 * 2 + 4/2 * (4 + 1)/2;
        // -10 + 8 + 4/2*5/2
        // -10 + 8 + 5
        // -2 + 5
        // 3
        System.out.println(value11); // 2 (3)

        int value12 = 11 % -7 + 10 + (14 - 6)/2 * 2;
        // 4 + 10 + 8
        // 22
        System.out.println(value12); // 14 (22)

        // ++ step up by 1 value
        int i = 10;
        i++; // 11 (i = i + 1)
        i += 1; // 12 (i = i + 1)
        System.out.println(i); // 12
        // --  step down by 1 value
        i--; // 11 (i = i - 1)
        System.out.println(i); // 11
        i -=1; // 10 (i = i - 1) // 10
        System.out.println(i);
    }
}
