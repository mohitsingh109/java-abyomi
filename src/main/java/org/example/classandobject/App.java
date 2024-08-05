package org.example.classandobject;

public class App {
    public static void main(String[] args) { // JVM
        System.out.println("Hello world");
        // OOPS

        // Java is a OOPS.
        // But Java is not a pure OOPS language.

        // C# is a pure OOPS.

        // What is pure OOPS?
        // If every thing is done using class & object

        int result = 10 + 20; // is it a class? // is it a object?
        // int, float, long, boolean, double, short, char they all are not class
        // they all are primitive data type

        // because java support primitive data type it's not consider as pure OOPS.

        // Wrapper class for primitive data type

        Integer result1 = 10 + 20; // using the Integer class object
        Long result2 = 10L + 20L;
        Float result3 = 23.4f;
        Double result4 = 34.56;
        Boolean result5 = false;
        Character result6 = 'A';


        System.out.println("Printing person.......");
        //DT VN = new DT();
        Person person = new Person();
        //person.name = "Mohit";
        person.setName("Mohit");
        //person.email = "test@gmail.com";
        person.setEmail("test@gmail.com");
        //person.address = "dummy";
        person.setAddress("dummy");
        //person.phoneNumber = "0000";
        person.setPhoneNumber("0000");
        person.printDetails();

        System.out.println(person.getName()); // Fix...

        System.out.println("Printing person1.......");
        Person person1 = new Person();
        person1.setName("Karan");
        person1.printDetails(); // what name, email, address, phoneNumber it will print
    }
}
