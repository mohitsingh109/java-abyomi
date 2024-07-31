package org.example.datatype;

public class Practice {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        switch (dayOfWeek){
            case 1:
                System.out.println("The day is monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is wednesday");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Thursday, friday and saturday");
                break;
            default:
                System.out.println("It could be sunday");
                break;

        }
        /**
         *
         *Write an if-else statement in Java that evaluates the following conditions for two integer variables x and y:
         *
         * If x is greater than 10 and y is less than 20, print "Condition 1 met".
         * If x is less than 5 or y is greater than 15, print "Condition 2 met".
         * If x is not equal to 7, print "Condition 3 met".
         * If none of the above conditions are met, print "No conditions met".
         * Given x = 12 and y = 18, what will be the output?
         */
        int x = 10;
        int y = 20;
        if(x>10 && y<20){
            System.out.println("Condition 1 is met");
        }else if (x<5 ||y>15){
            System.out.println("print condition 2 met");
        }else if(x!=7){
            System.out.println("Condition 3 met");
        }else {
            System.out.println("No conditions met");
        }

    }

}
