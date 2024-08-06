package org.example.assignment.assignment5;

public class Book {
    private String title;

    private String author;

    private double price;

    private Integer yearPublished;

    // setting printdetails method
    public void printBookDetails() {
        System.out.println("The book title is " + title);
        System.out.println("The book author is " + author);
        System.out.println("The book price is " + price);
        System.out.println("The book was published in " + yearPublished);

    }
    // setting getter method
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public  double getPrice() {
        return price;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    // set method
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void  setPrice(double price) {
        this.price = price;
    }

    public void  setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    // creating a different method to format price
    // i used chatgpt to find out how to format a string
    private String formatPrice() {
        return String.format("$%.2f", price);
    }


    //creating a public method to format discounted price
    public  double discountPrice(double discountPercentage) {
        return price- (price * discountPercentage / 100);
    }
}
