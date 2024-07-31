package org.example.datatype;

public class RelationalAndLogical {

    public static void main(String[] args) {
        // >= , <=, >, <, !=, ==

        int value1 = 10;
        int value2 = 20;

        if(value1 > value2) {
            System.out.println("value1 is greater");
        } else {
            System.out.println("value2 is greater");
        }

        boolean result = value1 > value2;
        System.out.println(result);

        value1 = 20;
        result = value1 == value2;
        System.out.println(result);

        value1 = 21;

        result = value1 != value2;
        System.out.println(result);

        // &&,  ||, !
        // and, or, not

        result = value1 > 20 && value2 > 50; // True && False
        //       value1 > 20 and value2 > 5
        System.out.println(result); // false

        result = value1 > 20 || value2 > 50; // True || False
        System.out.println(result); // True

        result = value1 > 20 && !(value2> 50); // True && !(False) --> // True && True
        System.out.println(result); // True
    }
}
