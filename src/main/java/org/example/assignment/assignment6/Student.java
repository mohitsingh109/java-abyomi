package org.example.assignment.assignment6;

public class Student {
    // Instance Variables
    private String name;
    private int age;
    private String studentID;
    private double gpa;

    // Static Members
    public static int totalStudents = 0;
    public static double totalGPA = 0.0;

    // Default Constructor
    public Student() {
        this(null, 0, null,0.0);
    }
//
    // Parameterized Constructor
    public Student(String name, int age, String studentID, double gpa) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.gpa = gpa;
        totalStudents++;
        totalGPA += this.gpa;
    }
//
    // Overloaded Constructor
    public Student(String name, int age, String studentID) {
        this(name, age, studentID, 0.0);
    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        // Update totalGPA when GPA is changed
        totalGPA -= this.gpa;
        this.gpa = gpa;
        totalGPA += this.gpa;
    }

    // Additional Methods
    public boolean isHonorRoll() {
        return this.gpa >= 3.5;
    }

    public void printDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("GPA: " + this.gpa);
    }

    // Static Method to get Average GPA
    public static double getAverageGPA() {
        if (totalStudents == 0) {
            return 0.0;
        }
        return totalGPA / totalStudents;
    }
}

