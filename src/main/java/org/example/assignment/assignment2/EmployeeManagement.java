package org.example.assignment.assignment2;

public class EmployeeManagement {
    public static void main(String[] args) {
        int experienceYears = 6;
        if (experienceYears > 5) {
            System.out.println("You are eligible for promotion");
        }

        // if else statement
        int salary = 60000;
        if (salary > 50000) {
            System.out.println("High salary bracket");
        } else {
            System.out.println("Low salary bracket");
        }

        // if else if statement
        int performanceScore = 20;
        if (performanceScore > 90) {
            System.out.println("Excellent");
            //elseif (performanceScore)
        } else if (performanceScore > 75) {
            System.out.println("Good");

        } else if (performanceScore > 60) {
            System.out.println("Average");

        } else {
            System.out.println("Needs improvement");
        }

        // switch statement
        int dayOfWeek = 7;
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a week day");
                break;
            case 6:
            case 7:
                System.out.println("It is a weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        // for loop

        for (int numbers = 1; numbers <= 10; numbers++) {
            System.out.println(numbers);
        }

        // while loop
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        // do while
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 5);

        // relational operator
        int age1 = 20;
        int age2 = 30;
        if (age2 > age1) {
            System.out.println("Employee 2 is older");
        } else {
            System.out.println("Employee 1 is older");
        }
        // experience and performance score
        int experience = 10;
        int performanceScore1 = 80;
        if (experience > 10 && performanceScore1 > 80) {
            System.out.println("You are eligible for a special bonus");
        } else {
            System.out.println("You are not eligible for a special bonus");
        }

    }
}
