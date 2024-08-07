package org.example.methodandfunction;

public class App {
    public static void main(String[] args) {
        //p = Printer();
        //DT VN = new DT();
        // This is creating the printer object
        Printer printer = new Printer();
        printer.print();
        printer.printWithArgs("This is args");

        //When you don't have any data member you should always create a class function
        //Calculator calculator = new Calculator(); // object
        int add = Calculator.add(10, 20, 10); // calling the static function
        System.out.println(add);
        long addLong = Calculator.add(20L, 40L);
        System.out.println(addLong);
        System.out.println("Hi i am string");
    }
}
