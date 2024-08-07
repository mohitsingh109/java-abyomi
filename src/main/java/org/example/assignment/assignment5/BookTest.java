package org.example.assignment.assignment5;

import org.example.methodandfunction.Calculator;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Java made simple", "Abayomi", 23.0, 2022);

        // save to the DB
//        book.setAuthor("Abayomi");
//        book.setPrice(23.0);
//        book.setTitle("Java made simple");
//        book.setYearPublished(2023);

         // fetch your record from DB
        // update the yearPublished
        book.setYearPublished(2023);

//        book.printBookDetails();
//        book.setCountOfBook(10); // set
//
//
        Book book1 = new Book("C++", "Mohit");
//        book1.setAuthor("Mohit");
//        book1.setPrice(40.0);
//        book1.setTitle("C++");
//        book1.setYearPublished(2024);
//        book1.printBookDetails();
//        System.out.println(book1.getCountOfBook()); // 10

        //Book book2 = new Book(); it will not work as we don't have default constructor
        Book.printCountOfBook(); // author, title, price, yearPublished
        //Calculator calculator = new Calculator(); // object
        int add = Calculator.add(10, 40);
    }
}
