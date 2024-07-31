package org.example.datatype;

public class Loops {

    public static void main(String[] args) {

        // while (if we've conditional loops)
        // do while (very very rare scenario)
        // for (100% it's use with array)
        // foreach loop

        for(int i = 1; i <= 10 ; i++) {
            // 1 <= 10
            // 2 <= 10
            // 3 <= 10
            //..
            // 10 <= 10
            // 11 <= 10 (False)
            System.out.println(i);
            //1
            //2
            //...
            //10
        }

        System.out.println("--------------");

        for (int i = 1; i <= 10 ; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("--------------");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("--------------");
        //Scanner class to take user input

        int table = 50;
        for(int i = 1; i <= 10; i++) {
            // "5 * 1 = 5"
            // "5 * 2 = 10"
            //...
            // 5 * 10 = 50
            System.out.println(table + " * " + i + " = " + table * i);
        }
        System.out.println("--------------");

        int i = 1;
        boolean flag = true;

        while (flag) { // if condition met run the code again & again
            System.out.println(i);
            i++;
            if(i == 20) {
                flag = false;
            }
        }
        flag = true;
        i = 1;

        do {
            System.out.println("will this run????");
            i++;
            if( i == 5) {
                flag = false;
            }
        } while (flag);
    }
}
