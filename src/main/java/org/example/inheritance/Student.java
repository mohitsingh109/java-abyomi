package org.example.inheritance;

// Student is a Person
// Student is a child class

// Single inheritance
// Person ---> Student
public class Student extends Person { // inheritance (Student will have access to person class)

    private String course;

    private Integer year;

//    public void displayStudent() {
//        displayDetails(); // This is coming from person class (Magic of inheritance)
//        System.out.println("Course: " + course);
//        System.out.println("Year: " + year);
//    }

    // function override
    @Override // annotation
    public void displayDetails() { // I am override the parent function
        super.displayDetails(); // I want to call the parent function
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
