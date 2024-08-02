package org.example.methodandfunction;

public class App {
    public static void main(String[] args) {
        //p = Printer();
        //DT VN = new DT();
        // This is creating the printer object
        Printer printer = new Printer();
        printer.print();
        printer.printWithArgs("This is args");

        Calculator calculator = new Calculator();
        int add = calculator.add(10, 20, 10);
        System.out.println(add);
        long addLong = calculator.add(20L, 40L);
        System.out.println(addLong);
        System.out.println("Hi i am string");
    }
}