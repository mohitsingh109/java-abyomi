package org.example.assignment;

public class Student {// only public and default are allowed at the top level
    private String name;

    private Integer age;

    private String rollNumber;

    private String course;

    // setting printdetails function
    public void printDetails() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Roll number " + rollNumber);
        System.out.println("Course " + course);
    }

    // getter and setter function
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
