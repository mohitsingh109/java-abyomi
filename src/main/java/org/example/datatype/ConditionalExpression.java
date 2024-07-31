package org.example.datatype;

public class ConditionalExpression {

    public static void main(String[] args) {

        // if
        // if else
        // if else if

        int value1 = 31;

        // if
        if (value1 > 5) {
            System.out.println("value1 is greater then 5");
        }

        // if else

        if(value1 > 50) { // 3 > 50
            System.out.println("value1 is greater then 50");
        } else {
            System.out.println("value1 is less then 50");
        }

        //if else if

        if(value1 > 50) { //  31 > 50
            System.out.println("value1 is greater then 50");
        } else if(value1 > 30) { // 31 > 30
            System.out.println("value1 is greater then 30");
        } else if(value1 > 10) { // 3> 10
            System.out.println("value1 is greater then 10");
        } else {
            System.out.println("value1 is less then 10");
        }


        // This can be improved by using switch statement
        if(value1 == 50) {
            System.out.println("it's 50");
        } else if(value1 == 40) {
            System.out.println("it's 40");
        } else if(value1 == 30) {
            System.out.println("it's 30");
        } else {
            System.out.println("it's other than 50, 40, 30");
        }

        switch (value1) {
            case 50:
                System.out.println("it's 50");
                break; // terminate the switch statement
            case 40:
                System.out.println("it's 40");
                break;
            case 30:
                System.out.println("it's 30");
                break;
            default:
                System.out.println("it's other than 50, 40, 30");
                break;
        }

    }
}
