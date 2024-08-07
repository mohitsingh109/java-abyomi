package org.example.assignment.assignment5;

public class Book {
    private String title;

    private String author;

    private Double price;

    private Integer yearPublished; // data member

    // it's use to create utils function & App constant
    private static Integer countOfBook = 10; // class variable

    // constructors
    // __init__(self, ...,...)

    // 1. it's used to initialize the data member
    // 2. single object creation (we'll learn it later)
    // 3. it's name is same as class name
    // 4. it doesn't have any return type
    // 5. in every class java create a default constructor if we don't define our own

    // constructor overloading
//    public Book() { // default constructor (No Args Constructor)
//        System.out.println("I am getting called");
//    }

    // All Args Constructor
    public Book(String title, String author, Double price, Integer yearPublished) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    public Book(String title, String author) {
        // we can call one constructor from another
        this(title, author, null, null); // it's calling the all args constructor
    }

    public Book(String title) {
        this(title, null, null, null); // it's calling the all args constructor
    }

    // setting printdetails method
    public void printBookDetails() { // object function
        System.out.println("The book title is " + title);
        System.out.println("The book author is " + author);
        System.out.println("The book price is " + formatPrice());
        System.out.println("The book was published in " + yearPublished);
        countOfBook++;
    }

    //static function
    // to have a utils function to be called without creating the object of the class
    public static void printCountOfBook() { // class function
        // inside the static function i can only access the static variable
        System.out.println(countOfBook);
    }

    // setting getter method
    public String getTitle() {
        return title;
    }

    public void setCountOfBook(Integer countOfBook) {
        Book.countOfBook = countOfBook; // work
    }

    public Integer getCountOfBook() {
        return countOfBook;
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
        this.title = title; // this refer to current object
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void  setPrice(Double price) {
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
