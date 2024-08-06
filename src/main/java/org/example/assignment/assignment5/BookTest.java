package org.example.assignment.assignment5;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Abayomi");
        book.setPrice(23);
        book.setTitle("Java made simple");
        book.setYearPublished(2023);
        book.printBookDetails();
    }
}
