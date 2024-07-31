package org.example.assignment.assignment1;

import java.sql.SQLOutput;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Basic arithmetic operations
        int addition = 25 + 35 + 100;
        int subtraction = 300 - 55 - 100;
        int multiplication = 100 * 3 * 43;
        int division = 700 / 33 / 25;
        int remain = 701 % 100;

        // Printing out the result of the basic arithmetic operation
        System.out.println("Sum is " + addition);
        System.out.println("The subtraction result gives " + subtraction);
        System.out.println("The multiplication result gives " + multiplication);
        System.out.println("The division result gives " + division);
        System.out.println("The remainder gives " + remain);

        // Using variables
        int first_number = 35;
        int second_number = 45;
        int third_number = 33;
        int result = first_number + second_number - third_number;

        // Printing out the result
        System.out.println("The final answer is " + result);

        // Different data types
        float combined_sum = 10.23f + 11.23f + 10.56f;
        long combined_minus = 10000000000L - 9999999L;
        short age_calc = 79 - 19;

        System.out.println("The sum of the float is " + combined_sum);
        System.out.println("The combined minus is " + combined_minus);
        System.out.println("The age equals " + age_calc);

        // Operator precedence
        int result1 = 120 - 25 * 5 / 10;
        float result2 = 30 * 5 - 2 + 11 / 2;
        short result3 = 30 - 5 * 3 + 5 / 12;

        // Print out the result
        System.out.println("The answer for result1 is " + result1);
        System.out.println("The answer for result2 is " + result2);
        System.out.println("The answer for result3 is " + result3);

        // Increment and decrement operator
        int x = 33;
        ++x; //now 34 first increment then return the value
        //x++; // now 34 it first return and then increment
        x += 2; // now 36
        x--; // now 35
        x -= 5; // now 30
        System.out.println("The final answer is " + x);

        // Complex expression
        int y = 20;
        int complexResult1 = 100 / 10 * 6 - 92 % 9 + 100 / 10 * 2;
        int complexResult2 = 7 % 5 * -5 + 20 / 5 * 2 + 4 / 2 * (4 + 1) / 2;
        int complexResult3 = (y++ * 5) + 10 - 3 * (y-- / 2); //80
        // (20 * 5) // y = 21
        // 100 + 10 - 3 * (21 / 2) y = 20
        // 100 + 10 - 3 * 10
        // 100 + 10 - 30
        // 80

        int complexResult4 = (y++ + 10) * (5 + y--) - 2 * y; //740
        // (20 + 10) // y = 21
        // 30 * (5 + 21) // y = 20
        // 30 * 26 - 2 * 20
        // 780 - 40
        // 740

        // y = 20
        int complexResult5 = (++y * 5) + 10 - 3 * (--y / 2); // 85??

        // Print the result
        System.out.println("The final answer for complex 1 is " + complexResult1);
        System.out.println("The final answer for complex 2 is " + complexResult2);
        System.out.println("The final answer for complex 3 is " + complexResult3);
        System.out.println("The final answer for complex 4 is " + complexResult4);
        System.out.println("The final answer for complex 5 is " + complexResult5);
    }
}
